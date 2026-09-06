package dosw.semana_2.pokemon;

import java.util.Objects;

/**
 * Modelo de dominio Pokémon, requerido a partir del Nivel 3 (Líder de
 * Gimnasio) del taller de la Bitácora Pokémon.
 */
public class Pokemon {

    private Long id;
    private String nombre;
    private String tipo;
    private int nivel;
    private double poderCombate;
    private String region;
    private boolean legendario;

    public Pokemon() {
    }

    public Pokemon(Long id, String nombre, String tipo, int nivel, double poderCombate,
                   String region, boolean legendario) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.poderCombate = poderCombate;
        this.region = region;
        this.legendario = legendario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPoderCombate() {
        return poderCombate;
    }

    public void setPoderCombate(double poderCombate) {
        this.poderCombate = poderCombate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isLegendario() {
        return legendario;
    }

    public void setLegendario(boolean legendario) {
        this.legendario = legendario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon pokemon)) return false;
        return Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return nombre + "(PC:" + poderCombate + ")";
    }
}
