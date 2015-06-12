import java.awt.Graphics;

public class tri extends java.applet.Applet {

   private LogoPrimitives logo;

   private void TRI(double n,double s){
                  if(n==0){
         TRIANGLE(s);
      } else {
         TRI(n-1,s/2);
         logo.fd(s/2);
         logo.wait(10);
         TRI(n-1,s/2);
         logo.lt(120);
         logo.fd(s/2);
         logo.wait(10);
         logo.rt(120);
         TRI(n-1,s/2);
         logo.lt(60);
         logo.bk(s/2);
         logo.wait(10);
         logo.rt(60);
}
            }
   private void TRIANGLE(double s){
            for(int i3 = 0;i3<3;i3++){
         logo.fd(s);
         logo.wait(10);
         logo.lt(120);
      }
   }
   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.rt(90);
      logo.fd(200);
      logo.rt(90);
      logo.fd(200);
      logo.lt(180);
      logo.pd();
      TRI(5,400);
   }
}
