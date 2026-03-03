//package s2950668;

public class Dog {
 String name;
 int age;

 public Dog(String n, int a) {
     name = n;
     age = a;
 }

 public String getName() {
     return name;
 }

 public void setName(String n) {
     name = n;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int a) {
     age = a;
 }

 public void bark() {
     System.out.println(name + "\n " +
     "/ \ \n_(    @\__ \n /         O\n /   (_____/ \n /_____/       " + ":woof");
 }
}
