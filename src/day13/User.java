package day13;

public class User {
    public String name;
    public int age;
    public boolean equals( Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof User){
            User user = (User)obj;
            if (user.age == this.age && this.name.equals(user.name)){
                return  true;
            }
            else return  false;
        }
       return  false;
    }
}
