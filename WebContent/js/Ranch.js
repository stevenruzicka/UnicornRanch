class Ranch {
    /*
        Ideally color and location would be in their own tables defined by ids, but for this 
        simple project, I'm just storing them as strings and manipulating the data through js.

        But if this was a real project, there would be a unicorn_color and ranch_location table as well.
        +----+-----------+--------+----------+
        | id | Name      | Color  | Location |
        +----+-----------+--------+----------+
        |  1 | Lucky     | Black  | Barn     |
        |  2 | Fred      | Red    | Barn     |
        |  3 | Orangey   | Orange | Barn     |
        |  4 | Bob       | Yellow | Barn     |
        |  5 | George    | Blue   | Barn     |
        |  6 | Valerie   | Red    | Barn     |
        |  7 | Constance | Purple | Barn     |
        |  8 | Winifred  | Pink   | Barn     |
        |  9 | Greeny    | Green  | Barn     |
        | 10 | Gisselle  | White  | Barn     |
        | 11 | Tealy     | Teal   | Barn     |
        | 12 | Danger    | Red    | Barn     |
        +----+-----------+--------+----------+
    */
    
	static ranchLocations = ["Barn","Pasture","Trails"];
    constructor(names, colors, locations) {
    	this.names = names.split("|");
    	this.colors = colors.split("|");
    	this.locations = locations.split("|");
        this.unicornList = [];
        for (var i = 0; i < this.names.length; i++) {
            this.unicornList[i] = new Unicorn(this.names[i],this.colors[i],this.locations[i]);
        }
    }

    // Static properties shared by all instances
    static ranchName = 'Unicorn Ranch';

    get unicorns() {
        return this.unicornList;
    }

}
 