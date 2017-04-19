package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	// Change this from ArrayList to HashMap.
	public HashMap<UUID, Player> HashMapPlayers = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		HashMapPlayers.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		HashMapPlayers.remove(p.getPlayerID());
		return this;
	}
}