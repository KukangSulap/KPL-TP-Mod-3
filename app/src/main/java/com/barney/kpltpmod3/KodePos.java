package com.barney.kpltpmod3;

class KodePos {
   private String kelurahan;
   private String kodePos;

   public KodePos(String kelurahan, String kodePos) {
      this.kelurahan = kelurahan;
      this.kodePos = kodePos;
   }


   public String getKelurahan() {
      return kelurahan;
   }

   public void setKelurahan(String kelurahan) {
      this.kelurahan = kelurahan;
   }

   public String getKodePos() {
      return kodePos;
   }

   public void setKodePos(String kodePos) {
      this.kodePos = kodePos;
   }
}
