package clean.code.design_patterns.requirements.Data;

import clean.code.design_patterns.requirements.Business.BaseProduct;
import clean.code.design_patterns.requirements.Business.MenuItem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CSVReader {
    public List<MenuItem> readCSV(String fileName){
        String basePath = "src/main/resources";
        String finalPath = basePath + "/" + fileName;

        File file = new File(finalPath);
        List<MenuItem> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] split = line.split(",");
                String title = split[0];
                String rating = split[1];
                String calories = split[2];
                String protein = split[3];
                String fat = split[4];
                String sodium = split[5];
                String price = split[6];
                try {
                    BaseProduct baseProduct = new BaseProduct(title, Double.parseDouble(rating), Integer.parseInt(calories), Integer.parseInt(protein),
                            Integer.parseInt(fat), Integer.parseInt(sodium), Integer.parseInt(price));

                    list.add(baseProduct);
                }
                catch (NumberFormatException numberFormatException){

                }
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }


        list = wipeDuplicates(list);

        return list;
    }

    private List<MenuItem> wipeDuplicates(List<MenuItem> list){
        List<MenuItem> auxList =  list.stream()
                .filter( distinctByKey(p -> p.getTitle()) )
                .collect( Collectors.toList() );;
        return auxList;
    }

    /**
     * Distinct by key predicate.
     *
     * @param <T>          the type parameter
     * @param keyExtractor the key extractor
     * @return the predicate
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor){
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
