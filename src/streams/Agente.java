package streams;

public class Agente {
    private String username;
    private String password;
    private boolean active;

    public Agente() {
    }

    public Agente(String username, String password, boolean active) {
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
