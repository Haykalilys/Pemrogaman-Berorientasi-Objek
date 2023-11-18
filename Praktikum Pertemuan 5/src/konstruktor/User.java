package konstruktor;
public class User {
public String username;
public String password;
public User(String username, String password){
this.username = username;
this.password = password; } }
class DemoConstructor{
public static void main(String[] args) {
User mahasiswa = new User ("Haykal Kamal Ilyasa", "MyUPJ");
System.out.println ("Username: " + mahasiswa.username);
System.out.println ("Password: " + mahasiswa.password); } }
