package Clases;
import java.util.List;


public class Docente {

        private List<String> titulosAcademicos;
        private List<String> areasDeEspecializacion;

        public Docente(List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
            this.titulosAcademicos = titulosAcademicos;
            this.areasDeEspecializacion = areasDeEspecializacion;
        }

        public List<String> getTitulosAcademicos() {
            return titulosAcademicos;
        }

        public void setTitulosAcademicos(List<String> titulosAcademicos) {
            this.titulosAcademicos = titulosAcademicos;
        }

        public List<String> getAreasDeEspecializacion() {
            return areasDeEspecializacion;
        }

        public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
            this.areasDeEspecializacion = areasDeEspecializacion;
        }
}
