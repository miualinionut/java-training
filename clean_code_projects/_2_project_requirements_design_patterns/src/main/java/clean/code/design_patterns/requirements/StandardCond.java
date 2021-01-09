package clean.code.design_patterns.requirements;
import java.io.*;

public class StandardCond {
    public static void standardRun() throws FileNotFoundException {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }));

        final int nrOfStatuses = 3;
        final int nrOfPlates = 55;
        final int nrOfModels = 56;
        final int nrOfNumbers = 100;
        final int nrOfProgresses = 2;

        final int nrOfInterventions = 21;
        final int nrOfNames = 30;
        final int nrOfSalaries = 4;

        File carLicensePlates = new File("CarLicensePlates.txt");
        File carModels = new File("CarModels.txt");
        File carPhoneNumbers = new File("CarPhoneNumbers.txt");
        File carCarStatus = new File("CarCarStatus.txt");
        File carRepairProgress = new File("CarRepairProgress.txt");

        File[] carFiles = new File[5];
        carFiles[0] = carLicensePlates;
        carFiles[1] = carModels;
        carFiles[2] = carPhoneNumbers;
        carFiles[3] = carCarStatus;
        carFiles[4] = carRepairProgress;
        Integer[] carFilesLen = new Integer[5];
        carFilesLen[0] = nrOfPlates;
        carFilesLen[1] = nrOfModels;
        carFilesLen[2] = nrOfNumbers;
        carFilesLen[3] = nrOfStatuses;
        carFilesLen[4] = nrOfProgresses;

        File workerInterventions = new File("WorkerInterventions.txt");
        File workerNames = new File("WorkerNames.txt");
        File workerSalaries = new File("WorkerSalaries.txt");

        File[] workerFiles = new File[3];
        workerFiles[0] = workerInterventions;
        workerFiles[1] = workerNames;
        workerFiles[2] = workerSalaries;
        Integer[] workerFilesLen = new Integer[3];
        workerFilesLen[0] = nrOfInterventions;
        workerFilesLen[1] = nrOfNames;
        workerFilesLen[2] = nrOfSalaries;
        Workshop workshop;
        try {
            File workshopData = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\workshopData.ser");
            if(workshopData.length() != 0) {
                FileInputStream fileIn = new FileInputStream(workshopData);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                workshop = (Workshop) objIn.readObject();
                fileIn.close();
                objIn.close();
            }
            else{
                throw new FileNotFoundException();
            }



            GUI ourGUI = new GUI(workshop, workerFiles, carFiles, workerFilesLen, carFilesLen);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Files could not be opened, reverting to random starting conditions");
            RandomStartCond.run();
        }
        catch (EOFException eofException){
            System.out.println("Unexpected end of file detected");
            eofException.printStackTrace();
        }
        catch (IOException ioException){
            System.out.println("IO exception on deserialization");
            ioException.printStackTrace();
        }
        catch (ClassNotFoundException classNotFoundException){
            System.out.println("Workshop class could not be found");
            classNotFoundException.printStackTrace();
        }
    }
}
