class contructorNew12
{
             public static void main(String args[])
             {
               printmedia pm=new printmedia();
               pm.newspaper();
             }


}


            

class printmedia
{

              printmedia()
              {
                System.out.println("Im Constructor in print media");
              }
 

              public void newspaper()
              {
                System.out.println("Im News Paper");
              }


}
