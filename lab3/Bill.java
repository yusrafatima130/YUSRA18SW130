import java.util.*;
class Bill{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your bill:");
    float unit=sc.nextFloat();
    float price=0;
    price=price+50*10;
    if(price<=50){
    	price=0;
    	System.out.println("The price is"+(unit*10));}
    else if (unit>=50 && unit<=100){
    	price=price+(unit-50)*15;
    	System.out.println("The price is:"+price);
    }
    else if(unit>=101 && unit <=200){
    	price=price+(50*15)+(unit-100)*20;
    	System.out.println("The price is:"+price);
    }
  else if(unit >=200 && unit<=300){
  	price=price+(50*15)+(100*20)+(unit-200)*25;
  	System.out.println("The price is: "+price);
  }
  else if(unit>=300){
price=price+(50*15)+(100*20)+(200*25)+(unit-300)*30;
System.out.println("The price is "+price);
  }
  else{
	System.out.println("NO BILL");
      }

	}
}