package clean.code.design_patterns.requirements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class GUI   {
    File CarHistory = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarHistory.txt");
    private static final int mainMenu = 0;
    private static final int carsMenu = 1;
    private static final int partsMenu = 2;
    private static final int workersMenu = 3;
    private static final int statsMenu = 4;
    private static final int minorPartMenu = 5;
    private static final int majorPartMenu = 6;
    private static final int fireMenu = 7;
    private static final int hireMenu = 8;


    private GridBagConstraints gbc = new GridBagConstraints();


    private static Calendar gregCal = new GregorianCalendar(2000, 1, 2, 8, 0);


    private JPanel[] panels = new JPanel[9];
    private JFrame[] frames = new JFrame[9];



    private JLabel dateLabel =  new JLabel("Current date and time: " + gregCal.getTime());
    private JLabel cashLabel1 = new JLabel();
    private JLabel cashLabel2 = new JLabel();
    private JLabel statsLabel = new JLabel();
    private JLabel hireWorkerLabel = new JLabel("Hire a random worker (this will cost 500$)");
    private JLabel fireWorkerLabel = new JLabel("Fire a worker by inputting their ID, then clicking the button");
    private JLabel minorPartLabel = new JLabel("Order parts for minor interventions (each part costs 125$)");
    private JLabel majorPartLabel = new JLabel("Order parts for major interventions (each part costs 500$)");


    private JButton carMenuButton = new JButton("Car Menu");
    private JButton partMenuButton = new JButton("Part Menu");
    private JButton workerMenuButton = new JButton("Worker Menu");
    private JButton statisticsButton = new JButton("Statistics");
    private JButton advanceTimeButton = new JButton("Advance simulation time");
    private JButton minorPartButton = new JButton("Order minor parts");
    private JButton majorPartButton = new JButton("Order major parts");
    private JButton fireButton = new JButton("Fire a worker (By ID)");
    private JButton hireButton = new JButton("Hire a new worker");
    private JButton confirmFireButton = new JButton("Confirm that you want to fire this worker");
    private JButton confirmHireButton = new JButton("Hire a random worker");
    private JButton confirmMinorPartButton = new JButton("Confirm Order");
    private JButton confirmMajorPartButton = new JButton("Confirm Order");


    private JTextField minorPartTextField = new JTextField("Input the number of parts you wish to order");
    private JTextField majorPartTextField = new JTextField("Input the number of parts you wish to order");
    private JTextField firedWorkerTextField = new JTextField("Input the ID of the worker you wish to fire");

    private JTextArea carTextArea = new JTextArea();
    private JTextArea workerTextArea = new JTextArea();

    /** The GUI constructor
     *
     * @param workshop the workshop, which will be controlled through the GUI
     * @param workerFiles files used to construct worker objects randomly
     * @param carFiles files used to construct car objects randomly
     * @param workerFilesLen the number of elements in each worker file file
     * @param carFilesLen the number of elements in each car file
     * Everything that happens in the GUI, from initialisation of every graphical element
     * to deciding everything done by the buttons, is decided in the constructor below
     */


    public GUI(Workshop workshop, File[] workerFiles, File[] carFiles, Integer[] workerFilesLen, Integer[] carFilesLen){
        int i;
        File timeFile = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\timeInfo.ser");
        if(timeFile.length() > 0){
            try {
                FileInputStream fileIn = new FileInputStream(timeFile);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                gregCal = (Calendar) objIn.readObject();
            }
            catch (FileNotFoundException fileNotFoundException){
                System.out.println("Time file could not be found");
                return;
            }
            catch (IOException ioException){
                System.out.println("Unexpected error at time file");
                return;
            }
            catch (ClassNotFoundException classNotFoundException){
                System.out.println("Class could not be found");
                return;
            }
        }

        // GUI button initialisation:
        // The buttons that are used to navigate the menus
        carMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(carsMenu, mainMenu, frames);
            }
        });

        partMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(partsMenu, mainMenu, frames);
            }
        });

        workerMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(workersMenu, mainMenu, frames);
            }
        });

        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(statsMenu, mainMenu, frames);
            }
        });


        minorPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(minorPartMenu, partsMenu, frames);
            }
        });

        majorPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(majorPartMenu, partsMenu, frames);
            }
        });

        fireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(fireMenu, workersMenu, frames);
            }
        });

        hireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisibilities(hireMenu, workersMenu, frames);
            }
        });

        //button used to fire workers

        confirmFireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String aux = firedWorkerTextField.getText();
                    Integer ID = Integer.parseInt(aux);
                    Worker[] workers = workshop.getWorkers();
                    boolean isSomeoneFired = false;
                    if(workers[ID] != null ){
                        for (int j = ID; j < workers.length - 1; j++) {
                            workers[j] = workers[j + 1];
                        }
                        workers = Arrays.copyOf(workers, workers.length-1);
                        workshop.setWorkers(workers);
                        isSomeoneFired = true;
                    }

                    if (isSomeoneFired == false) {
                        firedWorkerTextField.setText("No worker goes by that ID");
                        System.out.println("Firing failed");
                    } else {
                        updateWorkerTextArea(workerTextArea, workshop);
                        firedWorkerTextField.setText("Worker successfully fired");
                        System.out.println("Firing success");
                    }
                }
                catch(NumberFormatException nfe){
                    System.out.println("Bad input for text field");
                    firedWorkerTextField.setText("Please insert a number");
                }
            }
        });

        //button used to hire workers

        confirmHireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (workshop.getCash() >= 500) {
                        Worker newWorker = Worker.generateRandomWorker(workerFiles[1], workerFiles[2], workerFilesLen[1], workerFilesLen[2]);
                        String aux = newWorker.getName();
                        Worker[] workers = workshop.getWorkers();
                        workers = Arrays.copyOf(workers, workers.length + 1);
                        workers[workers.length - 1] = newWorker;
                        workshop.setCash(workshop.getCash() - 500);
                        workshop.setWorkers(workers);
                        System.out.print("Worker ");
                        System.out.println(aux);
                        System.out.println(" successfully hired");
                        updateWorkerTextArea(workerTextArea, workshop);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                }
                catch (FileNotFoundException fnfe){
                    System.out.println("Could not open worker files");
                }
            }
        });

        //button used to confirm buying new parts for minor interventions

        confirmMinorPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String aux = minorPartTextField.getText();
                    Integer nrOfParts = Integer.parseInt(aux);
                    Workshop.orderMinorParts(nrOfParts, workshop);
                    minorPartTextField.setText("Order successful");
                    System.out.println("Order successful");
                    updateLabels(workshop, carTextArea, workerTextArea, statsLabel, cashLabel1, cashLabel2);
                }
                catch(NumberFormatException nfe){
                    minorPartTextField.setText("Please insert a number");
                    System.out.println("Bad input in minor part text field");
                }
            }
        });

        //button used to confirm buying new parts for major interventions

        confirmMajorPartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String aux = majorPartTextField.getText();
                    Integer nrOfParts = Integer.parseInt(aux);
                    Workshop.orderMajorParts(nrOfParts, workshop);
                    majorPartTextField.setText("Order successful");
                    System.out.println("Order successful");
                    updateLabels(workshop, carTextArea, workerTextArea, statsLabel, cashLabel1, cashLabel2);
                }
                catch(NumberFormatException nfe){
                    majorPartTextField.setText("Please insert a number");
                    System.out.println("Bad input in major part text field");
                }
            }
        });

        //this is the button that advances the simulation time
        //most of the program logic is decided here

        advanceTimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gregCal.add(Calendar.HOUR_OF_DAY, 1);
                System.out.println();
                System.out.println("Current time: " + gregCal.getTime());
                System.out.println();
                int day;
                int startHour, endHour;
                int salaryAux = gregCal.getActualMaximum(Calendar.DATE);
                day = gregCal.get(Calendar.DAY_OF_WEEK);

                if(day >=2 && day <=6) {
                    startHour = 8;
                    endHour = 16;
                }
                else{
                    startHour = 10;
                    endHour = 14;
                }
                dateLabel.setText("Current date and time: " + gregCal.getTime());
                if (gregCal.get(Calendar.HOUR_OF_DAY) >= startHour && gregCal.get(Calendar.HOUR_OF_DAY) <= endHour) {
                    try {
                        Car car = Workshop.createNewCar(workshop, carFiles[0], carFiles[2], carFiles[1], carFilesLen[0], carFilesLen[2], carFilesLen[1]);
                        workshop.addCarOutside(workshop, car);
                    }
                    catch (FileNotFoundException fnfe){
                        System.out.println("Could not generate car");
                    }
                    Workshop.assignWork(workshop);
                    Workshop.clearWork(workshop);
                    Workshop.removeExistingCars(workshop, CarHistory);
                    Workshop.moveCarsInside(workshop);
                    updateCarTextArea(carTextArea, workshop);
                }
                else{
                    System.out.println("We are not during working hours");
                    System.out.println("Working hours are between " + startHour + " and " + endHour);
                }
                if(day == salaryAux){
                    Workshop.paySalaries(workshop);
                }

                updateLabels(workshop, carTextArea, workerTextArea, statsLabel, cashLabel1, cashLabel2);
                refreshMenus(frames);
            }
        });

        //Panel and frame initialisation:
        for(i = 0; i < panels.length; i++){
            panels[i] = new JPanel();


            panels[i].setLayout(new GridBagLayout());
            panels[i].setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));


            frames[i] = new JFrame();

            frames[i].add(panels[i], BorderLayout.CENTER );
            frames[i].setSize(400, 1100);
            frames[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frames[i].addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        File outputFile = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\workshopData.ser");
                        File timeFile = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\timeInfo.ser");
                        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                        FileOutputStream fileOutputStream1 = new FileOutputStream(timeFile);
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
                        objectOutputStream1.writeObject(gregCal);
                        objectOutputStream.writeObject(workshop);
                        objectOutputStream.close();
                        fileOutputStream.close();
                        objectOutputStream1.close();
                        fileOutputStream1.close();
                        System.exit(0);
                    }
                    catch (FileNotFoundException fileNotFoundException){
                        System.out.println("Files could not be found");
                        fileNotFoundException.printStackTrace();
                        return;
                    }
                    catch (IOException ioException){
                        ioException.printStackTrace();
                        return;
                    }
                }
            });

        }

        //Setting titles:

        initialiseTitles(frames);


        //Adding buttons and labels to the panels:

        addComponent(2, 0, 6, panels[mainMenu], dateLabel);
        addComponent(0, 2, 0, panels[mainMenu], carMenuButton);
        addComponent(0, 3, 0, panels[mainMenu], partMenuButton);
        addComponent(0, 4, 0, panels[mainMenu], workerMenuButton);
        addComponent(0, 5, 0, panels[mainMenu], statisticsButton);
        addComponent(0, 6, 0, panels[mainMenu], advanceTimeButton);



        initialiseTextArea(carTextArea, workshop);
        updateCarTextArea(carTextArea, workshop);
        addComponent(2, 0, 6, panels[carsMenu], carTextArea);


        updateCashLabel(cashLabel1, workshop);
        addComponent(2, 0, 6, panels[partsMenu], cashLabel1);
        addComponent(0, 2, 0, panels[partsMenu], minorPartButton);
        addComponent(0, 4, 0, panels[partsMenu], majorPartButton);



        updateCashLabel(cashLabel1, workshop);
        initialiseTextArea(workerTextArea, workshop);
        updateWorkerTextArea(workerTextArea, workshop);
        addComponent(2, 0, 6, panels[workersMenu], cashLabel2);
        addComponent(0, 2, 0, panels[workersMenu], workerTextArea);
        addComponent(0, 4, 0, panels[workersMenu], fireButton);
        addComponent(0, 6, 0, panels[workersMenu], hireButton);



        updateStatsLabel(statsLabel, workshop);
        addComponent(2, 0, 6 ,panels[statsMenu], statsLabel);


        addComponent(2, 0, 6, panels[minorPartMenu], minorPartLabel);
        addComponent(0, 2, 0, panels[minorPartMenu], minorPartTextField);
        addComponent(0, 4, 0, panels[minorPartMenu], confirmMinorPartButton);


        addComponent(2, 0, 6, panels[majorPartMenu], majorPartLabel);
        addComponent(0, 2, 0, panels[majorPartMenu], majorPartTextField);
        addComponent(0, 4, 0, panels[majorPartMenu], confirmMajorPartButton);

        addComponent(2, 0, 6, panels[fireMenu], fireWorkerLabel);
        addComponent(0, 2, 0, panels[fireMenu], firedWorkerTextField);
        addComponent(0, 4, 0, panels[fireMenu], confirmFireButton);

        addComponent(2, 0, 6, panels[hireMenu], hireWorkerLabel);
        addComponent(0, 2, 0, panels[hireMenu], confirmHireButton);



        //Adding the return buttons:

        for(i = 1; i < panels.length; i++){
            JButton returnButton = new JButton("Return to main menu");
            returnButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for(int j = 1; j < panels.length; j++){
                        frames[j].setVisible(false);
                    }
                    frames[mainMenu].setVisible(true);
                }
            });
            addComponent(0, 10, 0, panels[i], returnButton);
        }
        //Making everything visible/invisible:
        for(i = 0; i < panels.length; i++){
            if(i == mainMenu) {
                frames[i].setVisible(true);
            }
            else {
                frames[i].setVisible(false);

            }
        }
        dateLabel.setText("Current date and time: " + gregCal.getTime());
    }

    /** Updating every label
     *
     * @param workshop our shop
     * @param carTextArea the text area used to display the status of every car
     * @param workerTextArea the text area used to display information about our workers
     * @param statsLabel the label used to show the shop statistics
     * @param cashLabel1 the label used to show how much money the shop has
     * @param cashLabel2 the label used to show how much money the shop has
     * This method simply bundles all the update functions together, to make the code more compact
     *
     */

    private static void updateLabels(Workshop workshop, JTextArea carTextArea, JTextArea workerTextArea, JLabel statsLabel, JLabel cashLabel1, JLabel cashLabel2){
        updateCarTextArea(carTextArea, workshop);
        updateStatsLabel(statsLabel, workshop);
        updateCashLabel(cashLabel1, workshop);
        updateCashLabel(cashLabel2, workshop);
    }

    /** Making frames visible and invisible
     *
     * @param visibleFrame the target frame
     * @param invisibleFrame the origin frame
     * @param frames all the frames, in array form
     * Sets the origin frame as invisible, and the target frame as visible
     * Used while creating the action listeners for the buttons, in order to navigate
     * the menus by using them
     *
     */


    private static void handleVisibilities(int visibleFrame, int invisibleFrame, JFrame[] frames){
        frames[visibleFrame].setVisible(true);
        frames[invisibleFrame].setVisible(false);
    }

    /**Setting the titles
     *
     * @param frames all the frames, array form
     * Sets the title for every frame, used to make the code more compact
     */

    private static void initialiseTitles(JFrame[] frames){
        frames[mainMenu].setTitle("Main menu");
        frames[carsMenu].setTitle("Car menu");
        frames[partsMenu].setTitle("Parts menu");
        frames[workersMenu].setTitle("Workers menu");
        frames[statsMenu].setTitle("Statistics");
        frames[minorPartMenu].setTitle("Order minor parts");
        frames[majorPartMenu].setTitle("Order major parts");
        frames[fireMenu].setTitle("Fire a worker");
        frames[hireMenu].setTitle("Hire a worker");
    }

    /**Initialise the text area
     *
     * @param textArea the text area that we initialise
     * @param workshop our workshop
     * Method used to set the parameters of the text area, making it
     * only display information. Also updates the text area.
     */


    private static void initialiseTextArea(JTextArea textArea, Workshop workshop){
        textArea.setEditable(false);
        textArea.setCursor(null);
        textArea.setOpaque(false);
        textArea.setFocusable(false);
    }

    /** Adding components to the frames
     *
     * @param gridBagX x coordinate of the grid bag constraints
     * @param gridBagY y coordinate of the grid bag constraints
     * @param gridBagWidth width of the grid bag constraints
     * @param panel the panel to which we add the component
     * @param component the component we wish to add
     * Method used to add every component to the frame, using the grid bag layout
     */

    private static void addComponent (int gridBagX, int gridBagY, int gridBagWidth, JPanel panel, JComponent component){
        GridBagConstraints gdc = new GridBagConstraints();
        gdc.gridx = gridBagX;
        gdc.gridy = gridBagY;
        gdc.gridwidth = gridBagWidth;
        gdc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(component, gdc);
    }

    /** Update the car text area
     *
     * @param carsTextArea the car text area
     * @param workshop our workshop
     * We take every car that exists in the shop, and put all relevant
     * information relating to it in the text area
     */

    private static void updateCarTextArea (JTextArea carsTextArea, Workshop workshop){
        int i = 0;
        Car[] cars = workshop.getCarsInside();
        Iterator<Car> carIterator = new Iterator<>(cars);
        carsTextArea.setText(null);
        while (carIterator.hasNext()){
            Car currCar = carIterator.next();
            if(currCar != null) {
                carsTextArea.append("Car " + (i + 1) + ":" +
                        "\nPlate: " + currCar.getLicensePlate() +
                        "\nModel: " + currCar.getCarModel() +
                        "\nStatus: " + currCar.getCarStatus() +
                        "\nProgress: " + currCar.getRepairProgress() + "\n");
                i++;
            }

        }
    }

    /**Update the worker text area
     *
     * @param workerTextArea the worker text area
     * @param workshop our workshop
     * We take every worker that is employed by the shop,
     * And update the text area with all relevant information about them
     */

    private static void updateWorkerTextArea (JTextArea workerTextArea, Workshop workshop){
        int i = 0;
        Worker[] workers = workshop.getWorkers();
        Iterator<Worker> workerIterator = new Iterator<>(workers);
        workerTextArea.setText(null);
        while(workerIterator.hasNext()){
            Worker currWorker = workerIterator.next();
            if(currWorker != null){
                workerTextArea.append("Worker " + (i+1) + ":" +
                        "\nName: "+ currWorker.getName() +
                        "\nSalary: "+ currWorker.getSalary()+
                        "\nHours worked in a row:"+ currWorker.getHoursWorkedConsecutively()+
                        "\nExperience: "+ currWorker.getNumberOfInterventions() + "\n");
            }
        }

    }

    /**Updating the stats label
     *
     * @param statsLabel the statistics label
     * @param workshop the workshop
     * We take all the relevant information from the workshop, and put it in the label
     */
    private static void updateStatsLabel (JLabel statsLabel, Workshop workshop){
        int carsIn = findActualNrOfCars(workshop.getCarsInside()), carsOut = findActualNrOfCars(workshop.getCarsOutside());

        statsLabel.setText("<html> Cash: " + workshop.getCash() +
                "<br>Minor parts: " + workshop.getNrOfMinorParts()
                +  "<br>Major parts: " + workshop.getNrOfMajorParts()
                + "<br>Workers: " + workshop.getWorkers().length
                + "<br>Number of cars inside: "+ carsIn
                + "<br>Number of cars outside: "+ carsOut+ "</html>");
        return;
    }

    /** Finding all the members of the car array
     *
     * @param cars all the cars
     * @return nrOfCars the actual number of cars
     * We check for the number of non-null cars in the car array
     */
    private static int findActualNrOfCars(Car[] cars){
        int i, nrOfCars = 0;
        for(i = 0; i< cars.length; i++){
            if(cars[i] != null){
                nrOfCars++;
            }
        }
        return nrOfCars;
    }

    /** refreshing the menus
     *
     * @param frames all our frames
     * We make all frames but the main menu invisible.
     * Happens when clicking the return button
     */

    private static void refreshMenus (JFrame frames[]){
        int i;
        frames[0].setVisible(true);
        for(i = 1; i < frames.length; i++){
            frames[i].setVisible(false);
        }
    }

    /** Updates the cash label
     *
     * @param cashLabel the label that displays the shop's money
     * @param workshop the workshop
     * Gets the current amount of cash in the shop, and puts it in the label
     */

    private static void updateCashLabel (JLabel cashLabel, Workshop workshop){
        cashLabel.setText("Current cash available: " + workshop.getCash() +"$");
    }


}
