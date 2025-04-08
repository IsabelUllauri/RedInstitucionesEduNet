package Clases;
import java.util.List;


public class Administrativo {

        private List<String> cargos;
        private List<String> responsabilidades;

        public Administrativo(List<String> cargos, List<String> responsabilidades) {
            this.cargos = cargos;
            this.responsabilidades = responsabilidades;
        }

        public List<String> getCargos() {
            return cargos;
        }

        public void setCargos(List<String> cargos) {
            this.cargos = cargos;
        }

        public List<String> getResponsabilidades() {
            return responsabilidades;
        }

        public void setResponsabilidades(List<String> responsabilidades) {
            this.responsabilidades = responsabilidades;
        }

}
