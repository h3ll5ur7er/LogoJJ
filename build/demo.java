import java.awt.Graphics;

public class demo extends java.applet.Applet {

   private LogoPrimitives logo;

   public void paint(Graphics g) {
      logo = new LogoPrimitives(this);

      for(int i3 = 0;i3<3;i3++){
         logo.fd(100);
         logo.rt(120);
         logo.wait(750);
      }
      logo.wait(1500);
      logo.cs();
      for(int i3 = 0;i3<100;i3++){
         for(int i4 = 0;i4<3;i4++){
            logo.fd(100);
            logo.rt(120);
            logo.wait(2);
         }
         logo.rt(10);
      }
      logo.wait(1000);
      logo.cs();
      for(int i3 = 0;i3<1800;i3++){
         logo.fd(10);
         logo.rt(i3+0.1);
         logo.wait(1);
      }
      logo.wait(1000);
      logo.cs();
      for(int i3 = 0;i3<3600;i3++){
         logo.fd(10);
         logo.rt(i3+0.2);
      }
      logo.wait(2000);
      logo.cs();
      for(int i3 = 0;i3<8;i3++){
         logo.rt(45);
         for(int i4 = 0;i4<6;i4++){
            for(int i5 = 0;i5<90;i5++){
               logo.fd(2);
               logo.rt(2);
               logo.wait(1);
            }
            logo.rt(90);
         }
      }
      logo.wait(2000);
      logo.cs();
      for(int i3 = 0;i3<40;i3++){
         for(int i4 = 0;i4<34;i4++){
            logo.fd(12);
            logo.rt(10);
            logo.wait(1);
         }
         logo.rt(90);
      }
   }
}
