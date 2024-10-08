public class Friend { 
    private String name; 
    private boolean status; 

    public Friend(String username, boolean onlineStatus) { 
        this.name = username; 
        this.status = onlineStatus; 

    }

    public Friend(String username) { 
        this(username, onlineStatus:false); 

    }

    public String getUsername() { 
        return this.name; 

    }
    public boolean isOnline() { 
        return status; 
    }
    public void setStatus(boolean online) { 
        this.status = online; 
    }

    @Override
    public String toString() { 
        String s = this.status ? "Onlune" : "Offline";
        return this.name + " " + s; 
    }
}