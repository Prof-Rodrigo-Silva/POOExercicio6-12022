package classeexecutavel;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Area;
import model.Artigo;
import model.Autor;
import model.MiniCurso;
import model.Palestra;
import model.Submissao;

public class AppSubmissao {

	public static void main(String[] args) throws ParseException {

		Autor autor = new Autor("Rodrigo","rodrigo@gmail.com",999112233);

		Area area1, area2, area3;
		area1 = new Area("JAVA");
		area2 = new Area("Mineração de Dados");
		area3 = new Area("Lógica de Programação");

		Artigo artigo = new Artigo("Estudo e aplicação do JAVA OO",0,autor,area1,
				"Ferramentas de desenvolvimento OO");
		
		
		SimpleDateFormat sdfd = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfh = new SimpleDateFormat("HH:mm");

		String data = "08/07/2022";
		Date date = sdfd.parse(data);
		String hora = "19:00";
		Date h = sdfh.parse(hora);
				
		Palestra palestra = new Palestra("Mineração de dados na Saúde", 1, autor, area2,
				"Verificação de Números de Infectados", date, h);
		
		String hora_inicio = "18:00";
		String hora_fim = "21:00";
		data = "09/07/2022";
		Date hInicio = sdfh.parse(hora_inicio);
		Date hFim = sdfh.parse(hora_fim);
		date = sdfd.parse(data);
		
		MiniCurso miniCurso = new MiniCurso("PortugolStudio", 3,autor, area3, 3, date, hInicio, hFim);                       

		System.out.println("Artigo --------------Palestra palestra = new Palestra();\n"
				+ "		MiniCurso miniCurso =new MiniCurso();-----------------------------------");
		System.out.println("Descrição .........: " + artigo.getResumo());
		System.out.println("Titulo ............: " + artigo.getTitulo());
		System.out.println("Situação ..........: " + artigo.avaliar(artigo.getSituacao()));
		System.out.println("Autor .............: " + artigo.getAutor().getNome());
		System.out.println("Área ..............: " + artigo.getArea().getDescricao());
		
		System.out.println("Palestra -------------------------------------------------");
		System.out.println("Descrição .........: " + palestra.getDescricao());
		System.out.println("Data ..............: " + sdfd.format(palestra.getData()));
		System.out.println("Hora ..............: " + sdfh.format(palestra.getHora()));
		System.out.println("Titulo ............: " + palestra.getTitulo());
		System.out.println("Situação ..........: " + palestra.avaliar(palestra.getSituacao()));
		System.out.println("Autor .............: " + palestra.getAutor().getNome());
		System.out.println("Área ..............: " + palestra.getArea().getDescricao());
		
		System.out.println("MiniCurso -------------------------------------------------");
		System.out.println("Titulo ............: " + miniCurso.getTitulo());
		System.out.println("Data ..............: " + sdfd.format(miniCurso.getData()));
		System.out.println("Hora Início .......: " + sdfh.format(miniCurso.getHoraInicio()));
		System.out.println("Hora Fim ..........: " + sdfh.format(miniCurso.getHoraFim()));
		System.out.println("Situação ..........: " + miniCurso.avaliar(miniCurso.getSituacao()));
		System.out.println("Autor .............: " + miniCurso.getAutor().getNome());
		System.out.println("Área ..............: " + miniCurso.getArea().getDescricao());
		
		System.out.println("---------------------------------------------------------------");
		System.out.println(MiniCurso.getTotal());
		System.out.println(Palestra.getTotal());
		System.out.println(Artigo.getTotal());
		
		


	}

}
