package clean.code.design_patterns.requirements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RandomStartCond {

    public static void run() throws FileNotFoundException {
        int i;
        final int nrOfStatuses = 3;
        final int nrOfPlates = 55;
        final int nrOfModels = 56;
        final int nrOfNumbers = 100;
        final int nrOfProgresses = 2;

        final int nrOfInterventions = 21;
        final int nrOfNames = 30;
        final int nrOfSalaries = 4;

        final int workshopCash = 3500;
        final int minorParts = 30;
        final int majorParts = 30;
        File carLicensePlates = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarLicensePlates.txt");
        File carModels = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarModels.txt");
        File carPhoneNumbers = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarPhoneNumbers.txt");
        File carCarStatus = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarCarStatus.txt");
        File carRepairProgress = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\CarRepairProgress.txt");

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

        File workerInterventions = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\WorkerInterventions.txt");
        File workerNames = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\WorkerNames.txt");
        File workerSalaries = new File("C:\\Development\\workspace\\java-training\\clean_code_projects\\_2_project_requirements_design_patterns\\src\\main\\java\\clean\\code\\design_patterns\\requirements\\WorkerSalaries.txt");

        File[] workerFiles = new File[3];
        workerFiles[0] = workerInterventions;
        workerFiles[1] = workerNames;
        workerFiles[2] = workerSalaries;
        Integer[] workerFilesLen = new Integer[3];
        workerFilesLen[0] = nrOfInterventions;
        workerFilesLen[1] = nrOfNames;
        workerFilesLen[2] = nrOfSalaries;



        Worker[] workers = new Worker[5];
        for(i = 0; i < workers.length; i++){
            Random rand = new Random();
            Scanner interventionScanner = new Scanner(workerInterventions);
            Scanner nameScanner = new Scanner(workerNames).useDelimiter("\\n");
            Scanner salaryScanner = new Scanner(workerSalaries);

            Integer interventions = 0;
            String name = "uninitialised";
            Integer salary = 0;

            int randAux1 = rand.nextInt(nrOfInterventions);
            int randAux2 = rand.nextInt(nrOfNames);
            int randAux3 = rand.nextInt(nrOfSalaries);

            for(int j = 0; j < randAux1; j++){
                interventions = interventionScanner.nextInt();
            }
            for(int j = 0; j < randAux2; j++){
                name = nameScanner.next();
            }
            for(int j = 0; j < randAux3; j++){
                salary = salaryScanner.nextInt();
            }



            Worker.WorkerBuilder workerBuilder = new Worker.WorkerBuilder(name, salary);
            workerBuilder.setNumberOfInterventions(interventions);
            workers[i] = workerBuilder.build();

            interventionScanner.close();
            nameScanner.close();
            salaryScanner.close();
        }


        Car[] cars = new Car[12];
        for(i = 0; i < cars.length; i++){
            Random rand = new Random();

            String plates = "default plates";
            String model = "default model";
            String phoneNr = "default nr";
            CarStatus carStatus = CarStatus.UNDIAGNOSED;
            Integer repairStatus = 0;

            Scanner plateScanner = new Scanner(carLicensePlates);
            Scanner modelScanner = new Scanner(carModels).useDelimiter("\\n");
            Scanner phoneNumberScanner = new Scanner(carPhoneNumbers);
            Scanner carStatusScanner = new Scanner(carCarStatus);
            Scanner carRepairScanner = new Scanner(carRepairProgress);

            int randAux1 = rand.nextInt(nrOfPlates);
            int randAux2 = rand.nextInt(nrOfModels);
            int randAux3 = rand.nextInt(nrOfNumbers);
            int randAux4 = rand.nextInt(nrOfStatuses);
            int randAux5 = rand.nextInt(nrOfProgresses);

            for(int j = 0; j < randAux1; j++){
                plates = plateScanner.next();
            }
            for(int j = 0; j < randAux2; j++){
                model = modelScanner.next();
            }
            for(int j = 0; j < randAux3; j++){
                phoneNr = phoneNumberScanner.next();

            }
            for(int j = 0; j < randAux4; j++){
                String aux;
                aux = carStatusScanner.next();
                carStatus = CarStatus.valueOf(aux);
            }
            for(int j = 0; j < randAux5; j++){
                repairStatus = carRepairScanner.nextInt();
            }
            plateScanner.close();
            modelScanner.close();
            phoneNumberScanner.close();
            carStatusScanner.close();
            carRepairScanner.close();

            Car.CarBuilder carBuilder = new Car.CarBuilder(plates, phoneNr, model);
            carBuilder.setCarStatus(carStatus);
            carBuilder.setRepairProgress(repairStatus);
            cars[i] = carBuilder.build();
        }

        Workshop workshop = new Workshop(workers, workshopCash, minorParts,majorParts);
        Car[] carsInside = new Car[8];
        Car[] carsOutside = new Car[12];

        for(i = 0; i < 6; i++){
            carsInside[i] = cars[i];
        }
        for(i = 6; i < cars.length; i++){
            int j = 0;
            carsOutside[j] = cars[i];
        }
        workshop.setCarsInside(carsInside);
        workshop.setCarsOutside(carsOutside);

        GUI ourGUI = new GUI(workshop,workerFiles, carFiles, workerFilesLen, carFilesLen);

    }

}
