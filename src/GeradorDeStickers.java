import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class GeradorDeStickers {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception{
        // Realizar a leitura da imagem
        //InputStream inputStream = new FileInputStream(new File("entrada/TopMovies_1.jpg"));
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Criar nova imagem em memória com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // Copiar a imagem original pra nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Configuurar a fonte
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 48);
        graphics.setFont(fonte);
        graphics.setColor(Color.ORANGE);

        // Escrever algo na nova imagem
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a mensagem da imagem: ");
        String image = reader.nextLine();
        graphics.drawString(image, 60, novaAltura - 100); // Criiar mensagem com input do usuario
        reader.close();

        // Escrever a imagem nova em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
    }
}
