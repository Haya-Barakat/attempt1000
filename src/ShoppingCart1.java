import java.util.ArrayList;

public class ShoppingCart1 {
public int count ;
public int countP ;
public ArrayList <TheProduct1> Books = new ArrayList<TheProduct1>();

ShoppingCart1()
{
	count = 0;
	countP = 0;
}
public int getPcount() {
	// TODO Auto-generated method stub
	for(int i=0; i<Books.size() ; i++)
	{
		count += Books.get(i).TheQuantity ;
	}
	return count ;
}

public void AddBook(String BookName , int price , int quantity) {
	TheProduct1 P1 = new TheProduct1(BookName,price,quantity);
	Books.add(P1);
}

public int getPcost() {
	// TODO Auto-generated method stub
	for(int i=0; i<Books.size() ; i++)
	{
		countP += (Books.get(i).TheQuantity * Books.get(i).ThePrice) ;
	}
	return countP;
}
}