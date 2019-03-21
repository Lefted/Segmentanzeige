import javax.swing.JButton;

public class Button extends JButton{

	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Button() {
		isActive = false;
	}
}
