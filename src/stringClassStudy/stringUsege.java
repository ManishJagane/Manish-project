package stringClassStudy;

public class stringUsege {

	public static void main(String[] args) 
	{
		String name="Manish";
		String name1="Manish";
		System.out.println(name1);
		System.out.println(name);
		// without-new keyword
		String city= new String("Nagpur"); //With- new keyword
		
		//(1) length method use
		
		System.out.println(name.length());
		System.out.println(city.length());
		
		int out = name.length();//storing object in 
		System.out.println("length of my name is "+ out);
		System.out.println("++++++++++++++++++");
		
		
		//(2) toUppercasse
		String a=new String("Manish Jagane");
		
		System.out.println(a);
		System.out.println(a.toUpperCase());
		
		String b = a.toUpperCase();
		System.out.println(b);
		System.out.println(b.toUpperCase());
		
		System.out.println("=============");
		
		//(3) toLowerClass
		
		String c = b.toLowerCase();
		System.out.println(c.toLowerCase());
		
		String d="LOVE";
		System.out.println(d.toLowerCase());
		System.out.println("================");
		// (4) equals() method
		
		String a1 ="classmate";
		String a2= "classmate";
		String a3 = new String("classmate");
		String a4 = new String("classmate");
		String a5 = new String("Classmate");
		
		// == will compare memory location that will not compare String content\
		
		System.out.println(a1==a2);
		System.out.println(a1==a4);
		System.out.println(a3==a4);
		
		//equals() method compare content of String
		System.out.println("---------------------");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a4));
		
		System.out.println(a1.equals(a5));
		System.out.println(a4.equals(a5));
		System.out.println("=====================");
		System.out.println(a2.equalsIgnoreCase(a5));
		System.out.println("-----------------");
		
		// contains() method use
		String b1 ="pirate king";
		
		System.out.println(b1.contains("kin"));
		boolean result = b1.contains("te ");
		System.out.println("sequence of e is "+ result);
		System.out.println(b1.contains("pira"));
		
		System.out.println("==================");
		
		//isEmpty() method 
		String m="Nagpur";
		String n= "";
		String l= "  ";
		//String o= null;
		
		System.out.println(m.isEmpty());// it is not empty bcoz it have value 
		System.out.println(n.isEmpty());// its true bcoz it empty 
		System.out.println(l.isEmpty()); // its false bcoz it not empty it have value
		//System.out.println(o.isEmpty()); this shows exception Error 
		
		System.out.println("===================");
		System.out.println(m.isBlank());// Its false bcoz it contain not empty 
		System.out.println(n.isBlank());// its true bcz it empty. it has no word 
		System.out.println(l.isBlank());//its true bcz it empty. it has no word but only space 
		 
		System.out.println("======================");
		
		// charAt () method use
		String p= "COLOURFUL";

		System.out.println(p.charAt(2));
		System.out.println(p.charAt(0));
		//System.out.println(p.charAt(9));//Exception error 9 not a index no.
		System.out.println(p.charAt(5));
		System.out.println(p.charAt(8));
		
		System.out.println("-------------------");
		// endWith() mwthod study 
		
		String e= "Calculator";
		System.out.println(e.endsWith("r"));
		System.out.println(e.endsWith("tr"));
		System.out.println(e.endsWith("culator"));
		System.out.println(e.endsWith("Lator"));
		System.out.println("=================");
		
		
		System.out.println(e.startsWith("Cal"));
		System.out.println(e.startsWith("cal"));
		System.out.println(e.startsWith("ul", 4));
		System.out.println(e.startsWith("cul", 3));
		
		System.out.println("=================");
		
		// substring method use
		
		String test= "JD collage of Engineering and Management Nagpur";
		System.out.println(test.substring(14));
		System.out.println(test.substring(3));
		System.out.println(test.substring(0, 2));
		System.out.println(test.substring(3, 10));
		System.out.println(test.substring(11, 13));
		System.out.println(test.substring(14, 25));
		System.out.println(test.substring(26, 29));
		System.out.println(test.substring(30, 40));
		
		System.out.println("----------------------");
		//cooncat() method
		
		String x= "Heat";
		String y= "Exchanger";
		
		System.out.println(x.concat(y));
		System.out.println(x.concat(" ").concat(y));
		
		System.out.println("======================");
		
		//indexOf() method
		
		String h= "SYNOFSIS";
		System.out.println(h.indexOf("F"));
		System.out.println(h.indexOf("S"));
		System.out.println(h.indexOf("NO"));
		System.out.println(h.indexOf("S", 3));
		System.out.println(h.indexOf('S', 6));
		
		System.out.println(h.lastIndexOf('F'));
		
		System.out.println("=======================");
		
		
	//replace() method 
		
		String j= "Mechanical Engineering";
		
		System.out.println(j.replace('n', 't'));
		System.out.println(j.replace('e', 'k'));
		System.out.println(j.replaceAll("ch", "to"));
		System.out.println(j.replaceAll("Me", "Au"));
		System.out.println(j.replace(' ', '$'));
		
		
		
		
		
		
		
	}

}
