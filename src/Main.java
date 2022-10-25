public class Main {
    public static void main(String[] args) {
        FileData videoFunCats = new FileData("FunnyCats", 50, "C:/Users/user/Videos");
        FileData lessonOOP = new FileData("OOP", 75, "C:/Hillel");
        FileData lessonStrings = new FileData("Strings", 60, "C:/Hillel");
        FileData lessonCollections = new FileData("Collections", 70, "C:/Hillel");
        FileData lessonDictionaries = new FileData("Dictionaries", 80, "C:/Hillel");
        FileData telegram = new FileData("Telegram", 150, "C:/ProgramFiles/Telegram");
        FileData instagram = new FileData("Instagram", 160, "C:/ProgramFiles/Instagram");


        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/Users/user/Videos", videoFunCats);
        fileNavigator.add("C:/ProgramFiles/Hillel", lessonOOP);
        fileNavigator.add("C:/Hillel", lessonStrings);
        fileNavigator.add("C:/Hillel", lessonCollections);
        fileNavigator.add("C:/Hillel", lessonDictionaries);
        fileNavigator.add("C:/ProgramFiles/Telegram", telegram);
        fileNavigator.add("C:/ProgramFiles/Instagram", instagram);
        fileNavigator.remove("C:/ProgramFiles/Instagram");



        System.out.println(fileNavigator.find("C:/Hillel"));
        System.out.println(fileNavigator.find("C:/Users/user/Videos"));
        System.out.println(fileNavigator.filterBySize(70));
        System.out.println(fileNavigator.sortBySize());
    }
}