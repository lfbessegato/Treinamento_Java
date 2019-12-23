package escola;
// Interface Aluno.java
public interface Aluno {
	public static final float MEDIA_APROVADO = 6;
	public abstract float media();
	public abstract int faltas();
	public abstract float nota1(float nota);
	public abstract float nota2(float nota);

}
