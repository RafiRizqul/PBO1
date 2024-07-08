public class pengguna{
    private int id;
    private String username;
    private String password;



public int getId(){
    return this.id;
}
        
public String getUsername(){
    return this.username;
}

public String getPassword(){
    return this.password;
}

public void setId(int id){
    this.id = id;
}

public pengguna(int id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
}

public void setUsername(String username){
    this.username = username;
}

public void setPassword(String password){
    this.password = password;
}

public void login(){
    System.out.println("Ini method untuk Login");
}
    
public void lupaPassword(){
    System.out.println("Ini method Lupa Password");
}
    
public void daftar(){
    System.out.println("Ini method Daftar user baru");
}

public pengguna(){
    System.out.println("Object telah diciptakan, constructor berjalan");
}
}