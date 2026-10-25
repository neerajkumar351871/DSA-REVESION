// class OOPS
//     {
//         public static  void main(String args[])
//         {
//           Pen p1= new Pen();
//           p1.setColor("BLUE");
//           p1.setTip(3);
//           p1.printData();
            
//           Account sc= new Account();
//             sc.setPassword("Neeraj","#neeraj#3518");
//             sc.showpassword();
//           //System.out.println(sc.password); THIS IS NOT ALLOWED BECAUSE PASSWORD IS PRIVATE.
//         }
//     }
//  // --------------------------BANK ACCOUNT------------------------------------------
//  public class Account
//      {
//          public String  Name;
//          private String password;
//            void setPassword(String name,String password)
//          {
//              this.password=password;
//              this.Name= name;
//              return;
//          }
//           public void showpassword()
//          {   System.out.println("USER NAME:"+this.Name);
//              System.out.println("PASSWORD :"+this.password);
//          }
//      }
// // ----------------------------PEN CLASS------------------------------------
//  class Pen
//      {
//          String color;
//          int tip;
// //-------------------------------SET COLOR----------------------------------
//         void setColor(String color)
//          {
//              this.color= color;
//              return;
//          }
         
//     void setTip(int tip)
//          {
//              this.tip = tip;
//              return;
//          }
// // -------------------Gettter fun-------------------------------------------
//           void printData()
//          {
//          System.out.println("PEN COLOR:"+this.color+"->PEN TIP SIZE:"+tip);
//          }
    
//  }


// //-----------------------------------------CONSTRUCTOR-----------------------------------------
// class OOPS
//     {
//         public static void main(String args[])
//         {
//           // Student  sc= new Student();
//           Student s1 = new Student("Neeraj");
//           s1.name="Neeraj";
//           s1.roll= 124;
//           Student s2=  new Student(s1);
//           s2.password=123;   
//         System.out.print(s2.password);
//         }
//     }
// //-----------------------CONSTRUCTOR-----------------------------------------------------------
//  class  Student
//      {
//           String name;
//          int  roll;
//          int password;

//          // Copy  constructor
//           Student(Student p1)
//          {
//              this.name= p1.name;
//              this.roll= p1.roll;
             
//          }
//          // NON PARAMATERIZED CONSTRUCTOR.
//          Student()
//          {
//              System.out.println("NON PARAMATERIZED CONSTRUCTOR.");
//          }
//         // PARAMETERIZED CONSTRUCTOR.
//          Student( String name)
//          {
//             this.name= name;
//          }
//          Student(int roll)
//          {
//              this.roll= roll;
//          }
//      }


//-------------------------------INHERITANCE----------------------------------------------
// class OOPS
//     {
//      public static void main(String args[]) 
//         {
//           // fish shark = new fish();
//           // shark.eat();   
//             // Dog dobby = new Dog();
//             //  dobby.eat();
//             // dobby.legs=4;
//             // System.out.print(dobby.legs);
//             // bird sc = new bird();
//                 // sc.swim();
//             //     // sc.eat();
//             // Animal sc = new   Animal();
//             // sc.swim();
//         }
//     }
// BASE CLASS.
// class Animal
//      {
//          String color;
//          void eat()
//          {
//              System.out.println("Eats");
//          }
//          void breath()
//          {
//              System.out.println("BREATH");
//          }
//      }
//---------------------------------------------SINGLE INHERITANCE--------------------------
// dERIVED CALSS
 // class fish extends Animal
 //     {
 //      int fins;
 //         void swim()
 //         {
 //             System.out.println("Swims in water");
 //         }
         
 //     }

// --------------------------------MULTI-LEVEL INHERITANCES---------------------------------
// class Mammal extends Animal
//     {
//         int legs;
//     }
//  class Dog  extends Mammal
//      {
//          String breed;
//      }
//--------------------------------HIERARCHIAL INHERITANCE---------------------------------
//   class  Mammals extends Animal
//       {
//            void walk()
//           {
//               System.out.println(" WALK");
//           }
//       }
// class fish  extends Mammals 
//     {
//         void swim()
//         {
//             System.out.println("SWIM");
//         }
//     }
// class bird extends Mammals
//     {
//       void fly()
//         {
//                 System.out.println("FLY");
//         }
//     }

//------------------------------POLOYMORPHISM-------------------------------------------------
// 1 compile time - method overloading.
// 2.  run  time - method overriding.

// class OOPS
//     {
//         public static void main(String args[])
//         {
//           // Add value = new Add();
//           //   System.out.println(value.sum(1.2f,2.1f));
//             dog sc= new dog();
//             sc.eat();
            
//         }
//     }
// //------------------------------------METHOD OVERLOADING-------------------------------------
//   class  Add
//       {   
          
//        int sum(int a,int b)
//           {
//               return a+b;
//           }
//          float sum(float a , float b)
//           {
//               return a+b;
//           }
//           double sum(double a , double b)
//           {
//               return a+b;
//           }
//       }
// //------------------------------------METHOD OVERRIDING-------------------------------------
//  class Animal
//      {
//          void eat()
//          {
//              System.out.println("Animal eat");
//          }
//      }
// class dog extends Animal
//     {
//         void eat()
//         {
//             System.out.println("DOG EAT");
//         }
//     }


//-------------------------------ABSTRACTION--------------------------------------------
// class OOPS
//     {
//         public static  void main(String args[])
//         {
//           horse abc=  new horse();
//             // abc.walk();
//             abc.eat();
//         }
//     }
// abstract class Animal
//     {
//          void eat()
//         {
//            System.out.println("eat");
//         }
//         abstract void walk();
//     }
// class horse extends Animal
//     {
//         void walk()
//         {
//            System.out.print("Hello");
//             return;
//         }
//     }

//------------------------------------INTERFACE-----------------------------------------------
// class OOPs
//     {
//         public static void main(String args[])
//         {
//           Queen mov= new Queen();
//             mov.moves();
//         }
//     } 
// interface  chessplayer
//     {
//             void moves();
//     }
// class Queen implements chessplayer
//     { 
//          public void moves()
//          {
//         System.out.println("UP, DOWN LEFT, RIGHT DIAGONAL(MOVE 4 DIRECTION)");  
//          }
//    }
// class Rook implements chessplayer
//     {    public void moves(){
//         System.out.println("UP, DOWN LEFT, RIGHT");  
//     }
//    }
// class king implements chessplayer
//     {    public void moves(){
//         System.out.println("UP, DOWN LEFT, RIGHT DIAGONAL");
//     }
        
//    }

//-----------------------------MULTIPLE INHERITANCE---------------------------------------
// class OOPS
//     {
//         public static void main(String args[])
//         {
//           bear bc= new bear();
//             bc.eatgrass();
//             bc.eatChiken();
//         }
//     }
// interface herbivore
//     {
//              void  eatgrass(); 
//     }
// interface carbivore
//     {
//       void eatChiken();  
//     }
//  class  bear implements herbivore, carbivore
//      {
//       public void eatgrass()
//          {
//              System.out.println("EAT GRASS");
//          }
//      public void eatChiken()
//          {
//           System.out.println("EAT CHICKEN");   
//          }
         
//      }

//----------------------------------------STATIC KEY WORD-----------------------------------
// class OOPS
//     {
//         public static void main(String args[])
//         {
//             Student obj1= new Student();
//             obj1.setName("Neeraj kumar");
//             obj1.schoolName="HIMT";
//             Student obj2= new Student();
//             System.out.println(obj2.schoolName);
//         }
//     }
// class Student
//     {
//         String name;
//         int roll;
//         static String schoolName;
//          void setName(String name)
//         {
//             this.name= name;
//         }
//         String  getName()
//         {
//           return  this.name;
//         }
//     }

    // -----------------------------SUPER KEY WORD--------------------------------------------
class OOPS
    {
        public static void main(String args[])
        {
         //  horse sc= new horse();
         // sc.grass();
         // sc.eat();
            
        }
    }
 class Animal
    {
      public void eat()
         {
         System.out.println("ANIMAL EAT CHIKENS....");
         }
    }
class horse extends Animal
    {
        public void  grass()
         {
            
         System.out.println("HORSE EAT GRASS..");
         }
    }









