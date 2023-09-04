public class Main {

    public static void main(String[] args) {
	// write your code here
    person person1 = new person("Nan", 25);
    person person2 = new person("Top", 26);
    String info1 = "Name: " + person1.getName() + "/Age: " + person1.getAge();
    String info2 = "Name: " + person2.getName() + "/Age: " + person2.getAge();
    System.out.println(info1);
    System.out.println(info2);
    }

}