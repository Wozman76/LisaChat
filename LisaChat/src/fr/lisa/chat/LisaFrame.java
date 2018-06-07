package fr.lisa.chat;
import java.awt.Panel;

import javax.swing.JFrame;

import fr.theshark34.swinger.animation.Animator;
import fr.theshark34.swinger.util.WindowMover;


public class LisaFrame extends JFrame {

		

	private static final long serialVersionUID = 1L;
		static LisaFrame instance;
		private LisaPanel LisaPanel;
		
		
		public LisaFrame(){
			this.setTitle("LisaChat");
			this.setSize(975, 625);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			//this.setIconImage(Swinger.getResource("icon.png"));
			this.setContentPane(LisaPanel = new LisaPanel());

			
			
			WindowMover mover = new WindowMover(this);
			this.addMouseListener(mover);
			this.addMouseMotionListener(mover);
			
			
			this.setVisible(true);
			
			//Animator.fadeInFrame(this, 2);
			
		}
		
		
		public static void main(String[] args) {
			instance = new LisaFrame();
			
		}
		
		
		public static LisaFrame getInstance() {
			return instance;
		}
		
		
		
		public LisaPanel getLauncherPanel() {
			return this.LisaPanel;
		}
		
		

}
