public class StudentGrades {
    public static void main(String[] args) {
        String[] names = {"Greg", "Harvey", "Martha", "Joseph", "Mana"};
        int[] labPoints = {72, 41, 29, 68, 90};
        int[] bonusPoints = {3, 4, 6, 2, 8};
        
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
        
        for (int x = 0; x < names.length; x++) {
            int totalPoints = labPoints[x] + bonusPoints[x];
            System.out.println(names[x] + "\t\t" + labPoints[x] + "\t" + bonusPoints[x] + "\t" + totalPoints);
        }
    }
}
