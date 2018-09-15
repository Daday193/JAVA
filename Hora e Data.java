		//Importações necessárias.
		import java.awt.event.ActionListener;
		import java.text.SimpleDateFormat;
		import java.util.Calendar;
		import java.util.Date;
		import java.awt.event.ActionEvent;
		import javax.swing.Timer;
		
		
		//Criar data ao abrir a tela.
        Date dataSistema = new Date();
        //Converte a data em String no formato que eu quiser!
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //jldata é a Label que vai receber a data.
		jldata.setText(formato.format(dataSistema));
        
        //Criar Hora ao abrir a tela.
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        //Obs.: Criado método hora no fim da Classe Principal.
		class hora implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent E){
				Calendar now = Calendar.getInstance();
				//jlhora é a Label que vai receber a hora.
				jlhora.setText(String.format("%1$tH:%1tM:%1$tS", now));
			}
		}

        