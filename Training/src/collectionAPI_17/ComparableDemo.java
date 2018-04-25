package collectionAPI_17;
//Comparable interface has only method "public int compareTo(Object o)".
//java.lang.Comparable is used for default/natural sorting whereas java.util.Comparator is used for customised sorting. 
//o1.compareTo(o2) -> If o1 comes before o2, then -ve
//o1.compareTo(o2) -> If o1 comes after o2, then +ve
//o1.compareTo(o2) -> If o1 is as same as o2, then 0
//Comparator has two methods like :"public int compare(Object o1, Objecto2)" and "public boolean equals(Object o)".
//If o1 comes before o2, then -ve

public class ComparableDemo
{
	public static void main(String[] args)
	{
		Character a = 'A';
		Character z = 'Z';
		System.out.println(a.compareTo(z));    //-ve, because 'A' comes before 'Z'.
		System.out.println(a.compareTo(a));    // 0
		System.out.println(z.compareTo(a));    //+ve
	}

}
