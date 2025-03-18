class MainRunner{

public static void main(String... values)
{
String name="Makarasankranti";
String day="14 January ";
String nameOfGod="Surya";
Festival Festival1=new Festival(name,day,nameOfGod);
System.out.println("Name:"+Festival1.name+", Day:"+Festival1.day+" ,Name of the God:"+Festival1.nameOfGod);

Festival Festival2=new Festival("Maha Shivaratri","26 Feburary","Shiva");
System.out.println("Name:"+Festival2.name+", Day:"+Festival2.day+" ,Name of the God:"+Festival2.nameOfGod);


Festival Festival3=new Festival("Holi","14 March","RadhaKrishna");
System.out.println("Name:"+Festival3.name+", Day:"+Festival3.day+" ,Name of the God:"+Festival3.nameOfGod);

Festival Festival4=new Festival("Ugadi","30 March","Brahma");
System.out.println("Name:"+Festival4.name+", Day:"+Festival4.day+" ,Name of the God:"+Festival4.nameOfGod);

Festival Festival5=new Festival("Ramanavami","06 April","Rama");
System.out.println("Name:"+Festival5.name+", Day:"+Festival5.day+" ,Name of the God:"+Festival5.nameOfGod);


System.out.println("...........................................................................");


WhatsApp WhatsApp1=new WhatsApp(23,"Balck",true);
System.out.println("Number of Contacts:"+WhatsApp1.noOfContacts+" , Background Color:"+WhatsApp1.bgOfChats+", Online or offline:"+WhatsApp1.state);


WhatsApp WhatsApp2=new WhatsApp(78,"White",false);
System.out.println("Number of Contacts:"+WhatsApp2.noOfContacts+" , Background Color:"+WhatsApp2.bgOfChats+", Online or offline:"+WhatsApp2.state);

WhatsApp WhatsApp3=new WhatsApp(67,"Red",true);
System.out.println("Number of Contacts:"+WhatsApp3.noOfContacts+" , Background Color:"+WhatsApp3.bgOfChats+", Online or offline:"+WhatsApp3.state);

WhatsApp WhatsApp4=new WhatsApp(99,"Maroon",true);
System.out.println("Number of Contacts:"+WhatsApp4.noOfContacts+" , Background Color:"+WhatsApp4.bgOfChats+", Online or offline:"+WhatsApp4.state);

WhatsApp WhatsApp5=new WhatsApp(987,"Orange",false);
System.out.println("Number of Contacts:"+WhatsApp5.noOfContacts+", Background Color:"+WhatsApp5.bgOfChats+", Online or offline:"+WhatsApp5.state);


System.out.println("...........................................................................");


RatPoison RatPoison1=new RatPoison("Shadow Securitronics", "100g", 359);
System.out.println("Brand name:"+RatPoison1.name+" , Quantity:"+RatPoison1.quantity+", Price:"+RatPoison1.price);

RatPoison RatPoison2=new RatPoison("Ratol-Rat Buster", "200g", 199);
System.out.println("Brand name:"+RatPoison2.name+" , Quantity:"+RatPoison2.quantity+", Price:"+RatPoison2.price);

RatPoison RatPoison3=new RatPoison("MMR Making Marvelous", "250g", 251);
System.out.println("Brand name:"+RatPoison3.name+" , Quantity:"+RatPoison3.quantity+", Price:"+RatPoison3.price);

RatPoison RatPoison4=new RatPoison("Mortein", "30g", 64);
System.out.println("Brand name:"+RatPoison4.name+" , Quantity:"+RatPoison4.quantity+", Price:"+RatPoison4.price);

RatPoison RatPoison5=new RatPoison("Rat Repellent", "300g", 399);
System.out.println("Brand name:"+RatPoison5.name+" , Quantity:"+RatPoison5.quantity+", Price:"+RatPoison5.price);



System.out.println("...........................................................................");




Anklet Anklet1=new Anklet("Pandora",786 , 'L');
System.out.println("Brand name:"+Anklet1.category+" , Price:"+Anklet1.price+", Size:"+Anklet1.size);

Anklet Anklet2=new Anklet("Tanishq", 299, 'M');
System.out.println("Brand name:"+Anklet2.category+" , Price:"+Anklet2.price+", Size:"+Anklet2.size);

Anklet Anklet3=new Anklet("Clara Sunwoo",788 , 'L');
System.out.println("Brand name:"+Anklet3.category+" , Price:"+Anklet3.price+", Size:"+Anklet3.size);

Anklet Anklet4=new Anklet("Swarovski",455 , 'F');
System.out.println("Brand name:"+Anklet4.category+" , Price:"+Anklet4.price+", Size:"+Anklet4.size);

Anklet Anklet5=new Anklet("Zales",1000 , 'S');
System.out.println("Brand name:"+Anklet5.category+" , Price:"+Anklet5.price+", Size:"+Anklet5.size);



System.out.println("...........................................................................");



Magnet Magnet1=new Magnet("Black","Heart" ,5 );
System.out.println("color :"+Magnet1.color+" , Shape:"+Magnet1.shape+", Price:"+Magnet1.price);

Magnet Magnet2=new Magnet("White","Circle" , 10);
System.out.println("color :"+Magnet2.color+" , Shape:"+Magnet2.shape+", Price:"+Magnet2.price);

Magnet Magnet3=new Magnet("Red","Sphere" ,14 );
System.out.println("color :"+Magnet3.color+" , Shape:"+Magnet3.shape+", Price:"+Magnet3.price);

Magnet Magnet4=new Magnet("Grey","Cylinder" , 35);
System.out.println("color :"+Magnet4.color+" , Shape:"+Magnet4.shape+", Price:"+Magnet4.price);

Magnet Magnet5=new Magnet("Silver","Ring" , 27);
System.out.println("color :"+Magnet5.color+" , Shape:"+Magnet5.shape+", Price:"+Magnet5.price);



System.out.println("...........................................................................");


Chain Chain1=new Chain("Tanishq","Gold" ,10000L );
System.out.println("Name :"+Chain1.name+" , Material:"+Chain1.material+", Price:"+Chain1.price);

Chain Chain2=new Chain("CaratLane","Silver" , 5000L);
System.out.println("Name :"+Chain2.name+" , Material:"+Chain2.material+", Price:"+Chain2.price);

Chain Chain3=new Chain("BlueStone","Platinum" , 45000L);
System.out.println("Name :"+Chain3.name+" , Material:"+Chain3.material+", Price:"+Chain3.price);

Chain Chain4=new Chain("Swarovski","Stainless Steel" ,3000L );
System.out.println("Name :"+Chain4.name+" , Material:"+Chain4.material+", Price:"+Chain4.price);

Chain Chain5=new Chain("Chopard","Diamonds" ,50000L );
System.out.println("Name :"+Chain5.name+" , Material:"+Chain5.material+", Price:"+Chain5.price);


System.out.println("...........................................................................");


Bar Bar1=new Bar("Johnnie Walker","Whisky" , 1200);
System.out.println(" Brand Name :"+Bar1.brand+" , Category:"+Bar1.category+", Price:"+Bar1.price);

Bar Bar2=new Bar("Smirnoff","Vodka" ,1400 );
System.out.println(" Brand Name :"+Bar2.brand+" , Category:"+Bar2.category+", Price:"+Bar2.price);

Bar Bar3=new Bar("Bacardi","Rum" ,1500 );
System.out.println(" Brand Name :"+Bar3.brand+" , Category:"+Bar3.category+", Price:"+Bar3.price);

Bar Bar4=new Bar("Bombay Sapphire","Gin" , 4000);
System.out.println(" Brand Name :"+Bar4.brand+" , Category:"+Bar4.category+", Price:"+Bar4.price);

Bar Bar5=new Bar("Patrón","Tequila" , 5000);
System.out.println(" Brand Name :"+Bar5.brand+" , Category:"+Bar5.category+", Price:"+Bar5.price);


System.out.println("...........................................................................");



Charger Charger1=new Charger("Anker",1500, 'C');
System.out.println(" Brand Name :"+Charger1.name+" , Category:"+Charger1.type+", Price:"+Charger1.price);

Charger Charger2=new Charger("Samsung",800, 'C');
System.out.println(" Brand Name :"+Charger2.name+" , Category:"+Charger2.type+", Price:"+Charger2.price);

Charger Charger3=new Charger("Apple",1800, 'C');
System.out.println(" Brand Name :"+Charger3.name+" , Category:"+Charger3.type+", Price:"+Charger3.price);

Charger Charger4=new Charger("Xiaomi",500, 'C');
System.out.println(" Brand Name :"+Charger4.name+" , Category:"+Charger4.type+", Price:"+Charger4.price);

Charger Charger5=new Charger("OnePlus",1000, 'C');
System.out.println(" Brand Name :"+Charger5.name+" , Category:"+Charger5.type+", Price:"+Charger5.price);



System.out.println("...........................................................................");



Cloths Cloths1=new Cloths("Nike","Sportswear",2500);
System.out.println(" Brand Name :"+Cloths1.brand+" , Category:"+Cloths1.name+", Price:"+Cloths1.price);

Cloths Cloths2=new Cloths("Zara","Casual Wear",3500);
System.out.println(" Brand Name :"+Cloths2.brand+" , Category:"+Cloths2.name+", Price:"+Cloths2.price);

Cloths Cloths3=new Cloths("H&M","Trendy Fashion",900);
System.out.println(" Brand Name :"+Cloths3.brand+" , Category:"+Cloths3.name+", Price:"+Cloths3.price);

Cloths Cloths4=new Cloths("Puma","Sportswear",3599);
System.out.println(" Brand Name :"+Cloths4.brand+" , Category:"+Cloths4.name+", Price:"+Cloths4.price);

Cloths Cloths5=new Cloths("Raymond","Business Wear",2599);
System.out.println(" Brand Name :"+Cloths5.brand+" , Category:"+Cloths5.name+", Price:"+Cloths5.price);


System.out.println("...........................................................................");



Powder Powder1=new Powder("Maybelline","Buff Beige ",600);
System.out.println(" Brand Name :"+Powder1.name+" , Category:"+Powder1.color+", Price:"+Powder1.price);

Powder Powder2=new Powder("L’Oréal Paris","Sand",700);
System.out.println(" Brand Name :"+Powder2.name+" , Category:"+Powder2.color+", Price:"+Powder2.price);

Powder Powder3=new Powder("Lakmé","Beige",400);
System.out.println(" Brand Name :"+Powder3.name+" , Category:"+Powder3.color+", Price:"+Powder3.price);

Powder Powder4=new Powder("Revlon","Warm Honey",300);
System.out.println(" Brand Name :"+Powder4.name+" , Category:"+Powder4.color+", Price:"+Powder4.price);

Powder Powder5=new Powder("Innisfree","Translucent",500);
System.out.println(" Brand Name :"+Powder5.name+" , Category:"+Powder5.color+", Price:"+Powder5.price);




System.out.println("...........................................................................");



Shampoo Shampoo1=new Shampoo("Dove","650ml",350);
System.out.println(" Brand Name :"+Shampoo1.name+" , Quantity:"+Shampoo1.quantity+", Price:"+Shampoo1.price);

Shampoo Shampoo2=new Shampoo("Pantene","175ml",130);
System.out.println(" Brand Name :"+Shampoo2.name+" , Quantity:"+Shampoo2.quantity+", Price:"+Shampoo2.price);

Shampoo Shampoo3=new Shampoo("Sunsilk","180ml",400);
System.out.println(" Brand Name :"+Shampoo3.name+" , Quantity:"+Shampoo3.quantity+", Price:"+Shampoo3.price);

Shampoo Shampoo4=new Shampoo("Tresemme","580ml",550);
System.out.println(" Brand Name :"+Shampoo4.name+" , Quantity:"+Shampoo4.quantity+", Price:"+Shampoo4.price);

Shampoo Shampoo5=new Shampoo("Biotique","200ml",300);
System.out.println(" Brand Name :"+Shampoo5.name+" , Quantity:"+Shampoo5.quantity+", Price:"+Shampoo5.price);


System.out.println("...........................................................................");

Foundation Foundation1=new Foundation("MAC","30ml",2500);
System.out.println(" Brand Name :"+Foundation1.brandName+" , Quantity:"+Foundation1.quantity+", Price:"+Foundation1.price);

Foundation Foundation2=new Foundation("Huda Beauty","30ml",4500);
System.out.println(" Brand Name :"+Foundation2.brandName+" , Quantity:"+Foundation2.quantity+", Price:"+Foundation2.price);

Foundation Foundation3=new Foundation("Fenty Beauty","32ml",4000);
System.out.println(" Brand Name :"+Foundation3.brandName+" , Quantity:"+Foundation3.quantity+", Price:"+Foundation3.price);

Foundation Foundation4=new Foundation("NARS","30ml",3000);
System.out.println(" Brand Name :"+Foundation4.brandName+" , Quantity:"+Foundation4.quantity+", Price:"+Foundation4.price);

Foundation Foundation5=new Foundation("Clinique","30ml",2999);
System.out.println(" Brand Name :"+Foundation5.brandName+" , Quantity:"+Foundation5.quantity+", Price:"+Foundation5.price);


System.out.println("...........................................................................");

}
}