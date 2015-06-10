import java.awt.Graphics;

public class hexagon extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i3 = 0;i3<6;i3++){
         logo.fd(100);
         logo.rt(60);
      }
   }
}
