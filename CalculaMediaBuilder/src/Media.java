
import java.util.ArrayList;
import java.util.List;

/* 
 * MVC: Este � o MODEL
 * O Model tem a representa��o dos dados
 * e as regras de neg�cio  * para estes dados.Ele conversa com o  * Controller
 */
public class Media {
	private List<Double> fatores = new ArrayList<Double>();
	private double media;
	
	public void addMedia(double n) {
		fatores.add(n);
	}
	
	private void calculaMedia() {
		double total=0;
		
		for (Double valor:fatores) {
			total+=valor;
		}
		media = total/fatores.size();
	}
	
	public double getMedia() {
		calculaMedia();
		return media;
	}
	
	public String getMediaStr() {
		calculaMedia();
		return Double.toString(media);
	}

}
