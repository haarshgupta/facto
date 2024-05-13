public class fact{

public void in(int n){
int ans=1;
int sn=n;
//int tn=n;
for(int i=n;i>=1;i--){
ans=i*ans;
}
System.out.println("Factorial of "+n+" given number is "+ans);


} 
public static void main(String[] args){
fact obj=new fact();
obj.in(7);


}
}











