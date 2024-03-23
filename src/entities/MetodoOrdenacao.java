package entities;

public enum MetodoOrdenacao {

    INSERTION {
        @Override
        public Ordenacao getInstance() {
            return new Insertion();
        }
    },

    SELECTION {
        @Override
        public Ordenacao getInstance() {
            return new Selection(); 
        }
    },

    BUBBLE {
        @Override
        public Ordenacao getInstance() {
            return new Bubble();
        }
    };

    public abstract Ordenacao getInstance();
}
