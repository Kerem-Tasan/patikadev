import java.util.Scanner;
public class sıralama {
   
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
int s1,s2,s3;

System.out.println("1.sayıyı girin");
s1=src.nextInt();
System.out.println("2.sayıyı girin");
s2=src.nextInt();
System.out.println("3.sayıyı girin");
s3=src.nextInt();
while (s1<s2||s2<s3 ||s3<s2||s2<s3 ||s1<s3||s3<s1){
if(s1<s2 && s1<s3){
    if(s2<s3){System.out.println(s1+"<"+s2+"<"+s3);}
    else{System.out.println(s1+"<"+s3+"<"+s2);}
}
if (s2<s1 && s2<s3)
{
if(s1<s3){System.out.println(s2+"<"+s1+"<"+s3);}
else {System.out.println(s2+"<"+s3+"<"+s1);}

}
else if(s3<s2 && s3<s1)
{
if(s1<s2){
    System.out.println(s3+"<"+s1+"<"+s3);
}
else{System.out.println(s3+"<"+s2+"<"+s1);
}

}

}

}
}