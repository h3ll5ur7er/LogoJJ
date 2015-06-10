import java.awt.Graphics;

public class pentagon extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i3 = 0;i3<5.0;i3++){
         logo.fd(100.0);
         logo.rt(72.0);
      }
   }
}
