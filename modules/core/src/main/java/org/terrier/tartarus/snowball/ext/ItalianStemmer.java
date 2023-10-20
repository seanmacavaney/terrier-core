// Generated by Snowball 2.0.0 - https://snowballstem.org/

package org.terrier.tartarus.snowball.ext;

import org.terrier.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 *
 * <p>Generated by Snowball 2.0.0 - https://snowballstem.org/
 */
@SuppressWarnings("unused")
public class ItalianStemmer extends org.terrier.tartarus.snowball.SnowballStemmer {

  private static final long serialVersionUID = 1L;
  private static final java.lang.invoke.MethodHandles.Lookup methodObject =
      java.lang.invoke.MethodHandles.lookup();

  private static final Among a_0[] = {
    new Among("", -1, 7),
    new Among("qu", 0, 6),
    new Among("\u00E1", 0, 1),
    new Among("\u00E9", 0, 2),
    new Among("\u00ED", 0, 3),
    new Among("\u00F3", 0, 4),
    new Among("\u00FA", 0, 5)
  };

  private static final Among a_1[] = {
    new Among("", -1, 3), new Among("I", 0, 1), new Among("U", 0, 2)
  };

  private static final Among a_2[] = {
    new Among("la", -1, -1),
    new Among("cela", 0, -1),
    new Among("gliela", 0, -1),
    new Among("mela", 0, -1),
    new Among("tela", 0, -1),
    new Among("vela", 0, -1),
    new Among("le", -1, -1),
    new Among("cele", 6, -1),
    new Among("gliele", 6, -1),
    new Among("mele", 6, -1),
    new Among("tele", 6, -1),
    new Among("vele", 6, -1),
    new Among("ne", -1, -1),
    new Among("cene", 12, -1),
    new Among("gliene", 12, -1),
    new Among("mene", 12, -1),
    new Among("sene", 12, -1),
    new Among("tene", 12, -1),
    new Among("vene", 12, -1),
    new Among("ci", -1, -1),
    new Among("li", -1, -1),
    new Among("celi", 20, -1),
    new Among("glieli", 20, -1),
    new Among("meli", 20, -1),
    new Among("teli", 20, -1),
    new Among("veli", 20, -1),
    new Among("gli", 20, -1),
    new Among("mi", -1, -1),
    new Among("si", -1, -1),
    new Among("ti", -1, -1),
    new Among("vi", -1, -1),
    new Among("lo", -1, -1),
    new Among("celo", 31, -1),
    new Among("glielo", 31, -1),
    new Among("melo", 31, -1),
    new Among("telo", 31, -1),
    new Among("velo", 31, -1)
  };

  private static final Among a_3[] = {
    new Among("ando", -1, 1),
    new Among("endo", -1, 1),
    new Among("ar", -1, 2),
    new Among("er", -1, 2),
    new Among("ir", -1, 2)
  };

  private static final Among a_4[] = {
    new Among("ic", -1, -1),
    new Among("abil", -1, -1),
    new Among("os", -1, -1),
    new Among("iv", -1, 1)
  };

  private static final Among a_5[] = {
    new Among("ic", -1, 1), new Among("abil", -1, 1), new Among("iv", -1, 1)
  };

  private static final Among a_6[] = {
    new Among("ica", -1, 1),
    new Among("logia", -1, 3),
    new Among("osa", -1, 1),
    new Among("ista", -1, 1),
    new Among("iva", -1, 9),
    new Among("anza", -1, 1),
    new Among("enza", -1, 5),
    new Among("ice", -1, 1),
    new Among("atrice", 7, 1),
    new Among("iche", -1, 1),
    new Among("logie", -1, 3),
    new Among("abile", -1, 1),
    new Among("ibile", -1, 1),
    new Among("usione", -1, 4),
    new Among("azione", -1, 2),
    new Among("uzione", -1, 4),
    new Among("atore", -1, 2),
    new Among("ose", -1, 1),
    new Among("ante", -1, 1),
    new Among("mente", -1, 1),
    new Among("amente", 19, 7),
    new Among("iste", -1, 1),
    new Among("ive", -1, 9),
    new Among("anze", -1, 1),
    new Among("enze", -1, 5),
    new Among("ici", -1, 1),
    new Among("atrici", 25, 1),
    new Among("ichi", -1, 1),
    new Among("abili", -1, 1),
    new Among("ibili", -1, 1),
    new Among("ismi", -1, 1),
    new Among("usioni", -1, 4),
    new Among("azioni", -1, 2),
    new Among("uzioni", -1, 4),
    new Among("atori", -1, 2),
    new Among("osi", -1, 1),
    new Among("anti", -1, 1),
    new Among("amenti", -1, 6),
    new Among("imenti", -1, 6),
    new Among("isti", -1, 1),
    new Among("ivi", -1, 9),
    new Among("ico", -1, 1),
    new Among("ismo", -1, 1),
    new Among("oso", -1, 1),
    new Among("amento", -1, 6),
    new Among("imento", -1, 6),
    new Among("ivo", -1, 9),
    new Among("it\u00E0", -1, 8),
    new Among("ist\u00E0", -1, 1),
    new Among("ist\u00E8", -1, 1),
    new Among("ist\u00EC", -1, 1)
  };

  private static final Among a_7[] = {
    new Among("isca", -1, 1),
    new Among("enda", -1, 1),
    new Among("ata", -1, 1),
    new Among("ita", -1, 1),
    new Among("uta", -1, 1),
    new Among("ava", -1, 1),
    new Among("eva", -1, 1),
    new Among("iva", -1, 1),
    new Among("erebbe", -1, 1),
    new Among("irebbe", -1, 1),
    new Among("isce", -1, 1),
    new Among("ende", -1, 1),
    new Among("are", -1, 1),
    new Among("ere", -1, 1),
    new Among("ire", -1, 1),
    new Among("asse", -1, 1),
    new Among("ate", -1, 1),
    new Among("avate", 16, 1),
    new Among("evate", 16, 1),
    new Among("ivate", 16, 1),
    new Among("ete", -1, 1),
    new Among("erete", 20, 1),
    new Among("irete", 20, 1),
    new Among("ite", -1, 1),
    new Among("ereste", -1, 1),
    new Among("ireste", -1, 1),
    new Among("ute", -1, 1),
    new Among("erai", -1, 1),
    new Among("irai", -1, 1),
    new Among("isci", -1, 1),
    new Among("endi", -1, 1),
    new Among("erei", -1, 1),
    new Among("irei", -1, 1),
    new Among("assi", -1, 1),
    new Among("ati", -1, 1),
    new Among("iti", -1, 1),
    new Among("eresti", -1, 1),
    new Among("iresti", -1, 1),
    new Among("uti", -1, 1),
    new Among("avi", -1, 1),
    new Among("evi", -1, 1),
    new Among("ivi", -1, 1),
    new Among("isco", -1, 1),
    new Among("ando", -1, 1),
    new Among("endo", -1, 1),
    new Among("Yamo", -1, 1),
    new Among("iamo", -1, 1),
    new Among("avamo", -1, 1),
    new Among("evamo", -1, 1),
    new Among("ivamo", -1, 1),
    new Among("eremo", -1, 1),
    new Among("iremo", -1, 1),
    new Among("assimo", -1, 1),
    new Among("ammo", -1, 1),
    new Among("emmo", -1, 1),
    new Among("eremmo", 54, 1),
    new Among("iremmo", 54, 1),
    new Among("immo", -1, 1),
    new Among("ano", -1, 1),
    new Among("iscano", 58, 1),
    new Among("avano", 58, 1),
    new Among("evano", 58, 1),
    new Among("ivano", 58, 1),
    new Among("eranno", -1, 1),
    new Among("iranno", -1, 1),
    new Among("ono", -1, 1),
    new Among("iscono", 65, 1),
    new Among("arono", 65, 1),
    new Among("erono", 65, 1),
    new Among("irono", 65, 1),
    new Among("erebbero", -1, 1),
    new Among("irebbero", -1, 1),
    new Among("assero", -1, 1),
    new Among("essero", -1, 1),
    new Among("issero", -1, 1),
    new Among("ato", -1, 1),
    new Among("ito", -1, 1),
    new Among("uto", -1, 1),
    new Among("avo", -1, 1),
    new Among("evo", -1, 1),
    new Among("ivo", -1, 1),
    new Among("ar", -1, 1),
    new Among("ir", -1, 1),
    new Among("er\u00E0", -1, 1),
    new Among("ir\u00E0", -1, 1),
    new Among("er\u00F2", -1, 1),
    new Among("ir\u00F2", -1, 1)
  };

  private static final char g_v[] = {
    17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 128, 8, 2, 1
  };

  private static final char g_AEIO[] = {
    17, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 128, 8, 2
  };

  private static final char g_CG[] = {17};

  private int I_p2;
  private int I_p1;
  private int I_pV;

  private boolean r_prelude() {
    int among_var;
    int v_1 = cursor;
    while (true) {
      int v_2 = cursor;
      lab0:
      {
        bra = cursor;
        among_var = find_among(a_0);
        if (among_var == 0) {
          break lab0;
        }
        ket = cursor;
        switch (among_var) {
          case 1:
            slice_from("\u00E0");
            break;
          case 2:
            slice_from("\u00E8");
            break;
          case 3:
            slice_from("\u00EC");
            break;
          case 4:
            slice_from("\u00F2");
            break;
          case 5:
            slice_from("\u00F9");
            break;
          case 6:
            slice_from("qU");
            break;
          case 7:
            if (cursor >= limit) {
              break lab0;
            }
            cursor++;
            break;
        }
        continue;
      }
      cursor = v_2;
      break;
    }
    cursor = v_1;
    while (true) {
      int v_3 = cursor;
      lab1:
      {
        golab2:
        while (true) {
          int v_4 = cursor;
          lab3:
          {
            if (!(in_grouping(g_v, 97, 249))) {
              break lab3;
            }
            bra = cursor;
            lab4:
            {
              int v_5 = cursor;
              lab5:
              {
                if (!(eq_s("u"))) {
                  break lab5;
                }
                ket = cursor;
                if (!(in_grouping(g_v, 97, 249))) {
                  break lab5;
                }
                slice_from("U");
                break lab4;
              }
              cursor = v_5;
              if (!(eq_s("i"))) {
                break lab3;
              }
              ket = cursor;
              if (!(in_grouping(g_v, 97, 249))) {
                break lab3;
              }
              slice_from("I");
            }
            cursor = v_4;
            break golab2;
          }
          cursor = v_4;
          if (cursor >= limit) {
            break lab1;
          }
          cursor++;
        }
        continue;
      }
      cursor = v_3;
      break;
    }
    return true;
  }

  private boolean r_mark_regions() {
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    int v_1 = cursor;
    lab0:
    {
      lab1:
      {
        int v_2 = cursor;
        lab2:
        {
          if (!(in_grouping(g_v, 97, 249))) {
            break lab2;
          }
          lab3:
          {
            int v_3 = cursor;
            lab4:
            {
              if (!(out_grouping(g_v, 97, 249))) {
                break lab4;
              }
              golab5:
              while (true) {
                lab6:
                {
                  if (!(in_grouping(g_v, 97, 249))) {
                    break lab6;
                  }
                  break golab5;
                }
                if (cursor >= limit) {
                  break lab4;
                }
                cursor++;
              }
              break lab3;
            }
            cursor = v_3;
            if (!(in_grouping(g_v, 97, 249))) {
              break lab2;
            }
            golab7:
            while (true) {
              lab8:
              {
                if (!(out_grouping(g_v, 97, 249))) {
                  break lab8;
                }
                break golab7;
              }
              if (cursor >= limit) {
                break lab2;
              }
              cursor++;
            }
          }
          break lab1;
        }
        cursor = v_2;
        if (!(out_grouping(g_v, 97, 249))) {
          break lab0;
        }
        lab9:
        {
          int v_6 = cursor;
          lab10:
          {
            if (!(out_grouping(g_v, 97, 249))) {
              break lab10;
            }
            golab11:
            while (true) {
              lab12:
              {
                if (!(in_grouping(g_v, 97, 249))) {
                  break lab12;
                }
                break golab11;
              }
              if (cursor >= limit) {
                break lab10;
              }
              cursor++;
            }
            break lab9;
          }
          cursor = v_6;
          if (!(in_grouping(g_v, 97, 249))) {
            break lab0;
          }
          if (cursor >= limit) {
            break lab0;
          }
          cursor++;
        }
      }
      I_pV = cursor;
    }
    cursor = v_1;
    int v_8 = cursor;
    lab13:
    {
      golab14:
      while (true) {
        lab15:
        {
          if (!(in_grouping(g_v, 97, 249))) {
            break lab15;
          }
          break golab14;
        }
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      golab16:
      while (true) {
        lab17:
        {
          if (!(out_grouping(g_v, 97, 249))) {
            break lab17;
          }
          break golab16;
        }
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      I_p1 = cursor;
      golab18:
      while (true) {
        lab19:
        {
          if (!(in_grouping(g_v, 97, 249))) {
            break lab19;
          }
          break golab18;
        }
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      golab20:
      while (true) {
        lab21:
        {
          if (!(out_grouping(g_v, 97, 249))) {
            break lab21;
          }
          break golab20;
        }
        if (cursor >= limit) {
          break lab13;
        }
        cursor++;
      }
      I_p2 = cursor;
    }
    cursor = v_8;
    return true;
  }

  private boolean r_postlude() {
    int among_var;
    while (true) {
      int v_1 = cursor;
      lab0:
      {
        bra = cursor;
        among_var = find_among(a_1);
        if (among_var == 0) {
          break lab0;
        }
        ket = cursor;
        switch (among_var) {
          case 1:
            slice_from("i");
            break;
          case 2:
            slice_from("u");
            break;
          case 3:
            if (cursor >= limit) {
              break lab0;
            }
            cursor++;
            break;
        }
        continue;
      }
      cursor = v_1;
      break;
    }
    return true;
  }

  private boolean r_RV() {
    if (!(I_pV <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R1() {
    if (!(I_p1 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R2() {
    if (!(I_p2 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_attached_pronoun() {
    int among_var;
    ket = cursor;
    if (find_among_b(a_2) == 0) {
      return false;
    }
    bra = cursor;
    among_var = find_among_b(a_3);
    if (among_var == 0) {
      return false;
    }
    if (!r_RV()) {
      return false;
    }
    switch (among_var) {
      case 1:
        slice_del();
        break;
      case 2:
        slice_from("e");
        break;
    }
    return true;
  }

  private boolean r_standard_suffix() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_6);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        break;
      case 2:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_1 = limit - cursor;
        lab0:
        {
          ket = cursor;
          if (!(eq_s_b("ic"))) {
            cursor = limit - v_1;
            break lab0;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_1;
            break lab0;
          }
          slice_del();
        }
        break;
      case 3:
        if (!r_R2()) {
          return false;
        }
        slice_from("log");
        break;
      case 4:
        if (!r_R2()) {
          return false;
        }
        slice_from("u");
        break;
      case 5:
        if (!r_R2()) {
          return false;
        }
        slice_from("ente");
        break;
      case 6:
        if (!r_RV()) {
          return false;
        }
        slice_del();
        break;
      case 7:
        if (!r_R1()) {
          return false;
        }
        slice_del();
        int v_2 = limit - cursor;
        lab1:
        {
          ket = cursor;
          among_var = find_among_b(a_4);
          if (among_var == 0) {
            cursor = limit - v_2;
            break lab1;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_2;
            break lab1;
          }
          slice_del();
          switch (among_var) {
            case 1:
              ket = cursor;
              if (!(eq_s_b("at"))) {
                cursor = limit - v_2;
                break lab1;
              }
              bra = cursor;
              if (!r_R2()) {
                cursor = limit - v_2;
                break lab1;
              }
              slice_del();
              break;
          }
        }
        break;
      case 8:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_3 = limit - cursor;
        lab2:
        {
          ket = cursor;
          if (find_among_b(a_5) == 0) {
            cursor = limit - v_3;
            break lab2;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_3;
            break lab2;
          }
          slice_del();
        }
        break;
      case 9:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_4 = limit - cursor;
        lab3:
        {
          ket = cursor;
          if (!(eq_s_b("at"))) {
            cursor = limit - v_4;
            break lab3;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_4;
            break lab3;
          }
          slice_del();
          ket = cursor;
          if (!(eq_s_b("ic"))) {
            cursor = limit - v_4;
            break lab3;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_4;
            break lab3;
          }
          slice_del();
        }
        break;
    }
    return true;
  }

  private boolean r_verb_suffix() {
    if (cursor < I_pV) {
      return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    ket = cursor;
    if (find_among_b(a_7) == 0) {
      limit_backward = v_2;
      return false;
    }
    bra = cursor;
    slice_del();
    limit_backward = v_2;
    return true;
  }

  private boolean r_vowel_suffix() {
    int v_1 = limit - cursor;
    lab0:
    {
      ket = cursor;
      if (!(in_grouping_b(g_AEIO, 97, 242))) {
        cursor = limit - v_1;
        break lab0;
      }
      bra = cursor;
      if (!r_RV()) {
        cursor = limit - v_1;
        break lab0;
      }
      slice_del();
      ket = cursor;
      if (!(eq_s_b("i"))) {
        cursor = limit - v_1;
        break lab0;
      }
      bra = cursor;
      if (!r_RV()) {
        cursor = limit - v_1;
        break lab0;
      }
      slice_del();
    }
    int v_2 = limit - cursor;
    lab1:
    {
      ket = cursor;
      if (!(eq_s_b("h"))) {
        cursor = limit - v_2;
        break lab1;
      }
      bra = cursor;
      if (!(in_grouping_b(g_CG, 99, 103))) {
        cursor = limit - v_2;
        break lab1;
      }
      if (!r_RV()) {
        cursor = limit - v_2;
        break lab1;
      }
      slice_del();
    }
    return true;
  }

  @Override
  public boolean stem() {
    int v_1 = cursor;
    r_prelude();
    cursor = v_1;
    r_mark_regions();
    limit_backward = cursor;
    cursor = limit;
    int v_3 = limit - cursor;
    r_attached_pronoun();
    cursor = limit - v_3;
    int v_4 = limit - cursor;
    lab0:
    {
      lab1:
      {
        int v_5 = limit - cursor;
        lab2:
        {
          if (!r_standard_suffix()) {
            break lab2;
          }
          break lab1;
        }
        cursor = limit - v_5;
        if (!r_verb_suffix()) {
          break lab0;
        }
      }
    }
    cursor = limit - v_4;
    int v_6 = limit - cursor;
    r_vowel_suffix();
    cursor = limit - v_6;
    cursor = limit_backward;
    int v_7 = cursor;
    r_postlude();
    cursor = v_7;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof ItalianStemmer;
  }

  @Override
  public int hashCode() {
    return ItalianStemmer.class.getName().hashCode();
  }
}
