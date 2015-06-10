import java.awt.Graphics;

public class rotated extends java.applet.Applet {

   private LogoPrimitives logo;

   private void ROTATE(double angle,double times){
      double ANGLE = 0;
      double TIMES = 0;
      for(int i3 = 0;i3<0.0;i3++){
         logo.fd(200.0);
         logo.rt(0.0);
      }
   }
   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      logo.pu();
      logo.rt(180.0);
      logo.fd(100.0);
      logo.rt(90.0);
      logo.fd(20.0);
      logo.rt(90.0);
      logo.pd();
      ROTATE(155.0,72.0);
   }
}
