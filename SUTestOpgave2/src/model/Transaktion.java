package model;

import java.time.LocalDate;


    public class Transaktion {
        private int beløb;
        private LocalDate dato;
        private Konto konto;

        public Transaktion(int beløb, Konto konto) {
            this.beløb = beløb;
            this.konto = konto;
            this.dato = LocalDate.now();
            konto.getTransaktioner().add(this);
        }

        public int getBeløb() {
            return beløb;
        }

        public void setBeløb(int beløb) {
            this.beløb = beløb;
        }


        @Override
        public String toString() {
            return "Transaktion(" +
                    "kr " + beløb +
                    ", " + dato +
                    ')';
        }
    }

