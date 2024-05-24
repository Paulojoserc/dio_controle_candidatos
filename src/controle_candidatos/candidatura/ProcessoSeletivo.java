package controle_candidatos.candidatura;

public class ProcessoSeletivo {
public static void main(String[] args) {
	System.out.println("Processo seletivo");
	analiserCandidato(1900.0);
	analiserCandidato(2200.0);
	analiserCandidato(2000.0);
}
static void analiserCandidato(double salarioPretendido) {
	double salarioBase = 2000.0;
	if(salarioBase> salarioPretendido) {
		System.out.println("Ligar para o candidato");
	}else if(salarioBase==salarioPretendido) {
		System.out.println("Ligar para o candidatos com contra proposta");
	}else {
		System.out.println("Aguaradando p resultado dos demais candidatos");
	}
}
}
