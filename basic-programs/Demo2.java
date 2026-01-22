//Increment and Decrement 
public class Demo2 {
public static void main (String[]args){
System.out.println("val" +i);
i++;
System.out.println("val:a" + i++);
System.out.println("val:b" + i);
++i;
System.out.println("val:c" + i++);
System.out.println("val:d" + i++);
System.out.println("val:e" + i + i++ + i + ++i);
System.out.println("val:f" i + i++ + ++i + i + ++i + i++);
//  forloop 
for (int i=0; i<10;i++){
System.out.println("i:"+i);
}
//while loop
int j=10;
while (j>0){
System.out.println("j:"+i);
j--;
}
//do-while loop
int k=10;
do{
System.out.println("k:"+k);
k--;
}while (k>0);
}
}