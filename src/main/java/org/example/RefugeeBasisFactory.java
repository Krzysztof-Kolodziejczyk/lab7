package org.example;

import java.util.HashMap;

public class RefugeeBasisFactory {
  private static final HashMap<String, RefugeeBasis> refugees = new HashMap<>();

  private RefugeeBasisFactory() {
  }

  public static RefugeeBasis getRefugee(String name) {
    var result = refugees.get(name);
    if(result == null){
      result = new RefugeeBasis(name);
      refugees.put(name, result);
    }
    return result;
  }
}
