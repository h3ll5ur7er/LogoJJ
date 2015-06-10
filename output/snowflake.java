import java.awt.Graphics;

public class snowflake extends java.applet.Applet {

   private LogoPrimitives logo;

   private void DIVSIDE(double l,double s){
                  if(l==1){
         logo.fd(s);
      } else {
         DIVSIDE(l-1,s/3);
         logo.lt(60);
         DIVSIDE(l-1,s/3);
         logo.rt(120);
         DIVSIDE(l-1,s/3);
         logo.lt(60);
         DIVSIDE(l-1,s/3);
}
            }
   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.rt(180);
      logo.fd(150);
      logo.rt(90);
      logo.fd(85);
      logo.rt(90);
      logo.pd();
      for(int i3 = 0;i3<3;i3++){
         DIVSIDE(5,300);
         logo.rt(120);
      }
   }
}
