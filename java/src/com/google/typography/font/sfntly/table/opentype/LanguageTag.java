// Copyright 2012 Google Inc. All Rights Reserved.

package com.google.typography.font.sfntly.table.opentype;

import com.google.typography.font.sfntly.Tag;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A table of language names and their corresponding codes.
 * The OpenType ISO standard contains several typos in the language
 * names and is not as detailed as the ISO 639-3 languages list.
 * Therefore the latter takes precedence.
 *
 * @see "ISO-IEC 14496-22:2015, c066391_ISO_IEC_14496-22_2015.pdf, pages 318 to 338"
 */
enum LanguageTag {
  ABA("Abaza", "Abaza", "abq"),
  ABK("Abkhazian", "Abkhazian", "abk"),
  ACH("Acholi", "Acoli", "ach"),
  ACR("Achi", "Achi", "acr"),
  ADY("Adyghe", "Adyghe", "ady"),
  AFK("Afrikaans", "Afrikaans", "afr"),
  AFR("Afar", "Afar", "aar"),
  AGW("Agaw", "Qimant", "ahg"),
  AIO("Aiton", "Aiton", "aio"),
  AKA("Akan", "Akan", "aka"),
  ALS("Alsatian", "Swiss German", "gsw"),
  ALT("Altai", null /* ambiguous */, "atv,alt"),
  AMH("Amharic", "Amharic", "amh"),
  ANG("Anglo-Saxon", "Old English (ca. 450-1100)", "ang"),
  APPH("Phonetic transcription – Americanist conventions", null /* ambiguous */, ""),
  ARA("Arabic", "Arabic", "ara"),
  ARG("Aragonese", "Aragonese", "arg"),
  ARI("Aari", "Aari", "aiw"),
  ARK("Rakhine", null /* ambiguous */, "mhv,rmz,rki"),
  ASM("Assamese", "Assamese", "asm"),
  AST("Asturian", "Asturian", "ast"),
  ATH("Athapaskan", null /* ambiguous */, ""
          + "apk,apj,apl,apm,apw,nav,bea,sek,bcr,caf,"
          + "crx,clc,gwi,haa,chp,dgr,scs,xsl,srs,ing,"
          + "hoi,koy,hup,ktw,mvb,wlk,coq,ctc,gce,tol,"
          + "tuu,kkz,tgx,tht,aht,tfn,taa,tau,tcb,kuu,"
          + "tce,ttm,txc"),
  AVR("Avar", "Avaric", "ava"),
  AWA("Awadhi", "Awadhi", "awa"),
  AYM("Aymara", "Aymara", "aym"),
  AZB("Torki", "South Azerbaijani", "azb"),
  AZE("Azerbaijani", "Azerbaijani", "aze"),
  BAD("Badaga", "Badaga", "bfq"),
  BAD0("Banda", null /* not in ISO 639-3 */, "bad"),
  BAG("Baghelkhandi", "Bagheli", "bfy"),
  BAL("Balkar", "Karachay-Balkar", "krc"),
  BAN("Balinese", "Balinese", "ban"),
  BAR("Bavarian", "Bavarian", "bar"),
  BAU("Baoulé", "Baoulé", "bci"),
  BBC("Batak Toba", "Batak Toba", "bbc"),
  BBR("Berber", null /* ambiguous */, ""),
  BCH("Bench", "Bench", "bcq"),
  BCR("Bible Cree", null /* ambiguous */, ""),
  BDY("Bandjalang", "Bandjalang", "bdy"),
  BEL("Belarusian", "Belarusian", "bel"),
  BEM("Bemba", "Bemba (Zambia)", "bem"),
  BEN("Bengali", "Bengali", "ben"),
  BGC("Haryanvi", "Haryanvi", "bgc"),
  BGQ("Bagri", "Bagri", "bgq"),
  BGR("Bulgarian", "Bulgarian", "bul"),
  BHI("Bhili", null /* ambiguous */, "bhi,bhb"),
  BHO("Bhojpuri", "Bhojpuri", "bho"),
  BIK("Bikol", null /* ambiguous */, "bik,bhk,bcl,bto,cts,bln"),
  BIL("Bilen", "Bilin", "byn"),
  BIS("Bislama", "Bislama", "bis"),
  BJJ("Kanauji", "Kanauji", "bjj"),
  BKF("Blackfoot", "Siksika", "bla"),
  BLI("Baluchi", "Baluchi", "bal"),
  BLK("Pa'o Karen", "Pa'o Karen", "blk"),
  BLN("Balante", null /* ambiguous */, "bjt,ble"),
  BLT("Balti", "Balti", "bft"),
  BMB("Bambara (Bamanankan)", "Bambara", "bam"),
  BML("Bamileke", null /* ambiguous */, ""),
  BOS("Bosnian", "Bosnian", "bos"),
  BPY("Bishnupriya Manipuri", "Bishnupriya", "bpy"),
  BRE("Breton", "Breton", "bre"),
  BRH("Brahui", "Brahui", "brh"),
  BRI("Braj Bhasha", "Braj", "bra"),
  BRM("Burmese", "Burmese", "mya"),
  BRX("Bodo", "Bodo (India)", "brx"),
  BSH("Bashkir", "Bashkir", "bak"),
  BTI("Beti", null /* not in ISO 639-3 */, "btb"),
  BTS("Batak Simalungun", "Batak Simalungun", "bts"),
  BUG("Bugis", "Buginese", "bug"),
  CAK("Kaqchikel", "Kaqchikel", "cak"),
  CAT("Catalan", "Catalan", "cat"),
  CBK("Zamboanga Chavacano", "Chavacano", "cbk"),
  CEB("Cebuano", "Cebuano", "ceb"),
  CHE("Chechen", "Chechen", "che"),
  CHG("Chaha Gurage", "Sebat Bet Gurage", "sgw"),
  CHH("Chattisgarhi", "Chhattisgarhi", "hne"),
  CHI("Chichewa (Chewa, Nyanja)", "Nyanja", "nya"),
  CHK("Chukchi", "Chukot", "ckt"),
  CHK0("Chuukese", "Chuukese", "chk"),
  CHO("Choctaw", "Choctaw", "cho"),
  CHP("Chipewyan", "Chipewyan", "chp"),
  CHR("Cherokee", "Cherokee", "chr"),
  CHA("Chamorro", "Chamorro", "cha"),
  CHU("Chuvash", "Chuvash", "chv"),
  CHY("Cheyenne", "Cheyenne", "chy"),
  CGG("Chiga", "Chiga", "cgg"),
  CMR("Comorian", null /* ambiguous */, "swb,wlc,wni,zdj"),
  COP("Coptic", "Coptic", "cop"),
  COR("Cornish", "Cornish", "cor"),
  COS("Corsican", "Corsican", "cos"),
  CPP("Creoles", null /* not in ISO 639-3 */, "cpp"),
  CRE("Cree", "Cree", "cre"),
  CRR("Carrier", null /* ambiguous */, "crx,caf"),
  CRT("Crimean Tatar", "Crimean Tatar", "crh"),
  CSB("Kashubian", "Kashubian", "csb"),
  CSL("Church Slavonic", "Church Slavic", "chu"),
  CSY("Czech", "Czech", "ces"),
  CTG("Chittagonian", "Chittagonian", "ctg"),
  CUK("San Blas Kuna", "San Blas Kuna", "cuk"),
  DAN("Danish", "Danish", "dan"),
  DAR("Dargwa", "Dargwa", "dar"),
  DAX("Dayi", "Dayi", "dax"),
  DCR("Woods Cree", "Woods Cree", "cwd"),
  DEU("German", "German", "deu"),
  DGO("Dogri", "Dogri (individual language)", "dgo"),
  DGR("Dogri", "Dogri (macrolanguage)", "doi"),
  DHG("Dhangu", "Dhangu-Djangu", "dhg"),
  DHV("Divehi (Dhivehi, Maldivian)", "Dhivehi", "div"), // deprecated
  DIQ("Dimli", "Dimli (individual language)", "diq"),
  DIV("Divehi (Dhivehi, Maldivian)", "Dhivehi", "div"),
  DJR("Zarma", "Zarma", "dje"),
  DJR0("Djambarrpuyngu", "Djambarrpuyngu", "djr"),
  DNG("Dangme", "Adangme", "ada"),
  DNJ("Dan", "Dan", "dnj"),
  DNK("Dinka", "Dinka", "din"),
  DRI("Dari", "Dari", "prs"),
  DUJ("Dhuwal", null /* not in ISO 639-3 */, "duj"),
  DUN("Dungan", "Dungan", "dng"),
  DZN("Dzongkha", "Dzongkha", "dzo"),
  EBI("Ebira", "Ebira", "igb"),
  ECR("Eastern Cree", null /* ambiguous */, "crj,crl"),
  EDO("Edo", "Bini", "bin"),
  EFI("Efik", "Efik", "efi"),
  ELL("Greek", "Modern Greek (1453-)", "ell"),
  EMK("Eastern Maninkakan", "Eastern Maninkakan", "emk"),
  ENG("English", "English", "eng"),
  ERZ("Erzya", "Erzya", "myv"),
  ESP("Spanish", "Spanish", "spa"),
  ESU("Central Yupik", "Central Yupik", "esu"),
  ETI("Estonian", "Estonian", "est"),
  EUQ("Basque", "Basque", "eus"),
  EVK("Evenki", "Evenki", "evn"),
  EVN("Even", "Even", "eve"),
  EWE("Ewe", "Ewe", "ewe"),
  FAN("French Antillean", "Saint Lucian Creole French", "acf"),
  FAN0("Fang", "Fang (Equatorial Guinea)", "fan"),
  FAR("Persian", "Persian", "fas"),
  FAT("Fanti", "Fanti", "fat"),
  FIN("Finnish", "Finnish", "fin"),
  FJI("Fijian", "Fijian", "fij"),
  FLE("Dutch (Flemish)", "Vlaams", "vls"),
  FNE("Forest Nenets", "Forest Enets", "enf"),
  FON("Fon", "Fon", "fon"),
  FOS("Faroese", "Faroese", "fao"),
  FRA("French", "French", "fra"),
  FRC("Cajun French", "Cajun French", "frc"),
  FRI("Frisian", "Western Frisian", "fry"),
  FRL("Friulian", "Friulian", "fur"),
  FRP("Arpitan", "Arpitan", "frp"),
  FTA("Futa", "Pular", "fuf"),
  FUL("Fulah", "Fulah", "ful"),
  FUV("Nigerian Fulfulde", "Nigerian Fulfulde", "fuv"),
  GAD("Ga", "Ga", "gaa"),
  GAE("Scottish Gaelic (Gaelic)", "Scottish Gaelic", "gla"),
  GAG("Gagauz", "Gagauz", "gag"),
  GAL("Galician", "Galician", "glg"),
  GAR("Garshuni", null /* ambiguous */, ""),
  GAW("Garhwali", "Garhwali", "gbm"),
  GEZ("Ge'ez", "Geez", "gez"),
  GIH("Githabul", "Githabul", "gih"),
  GIL("Gilyak", "Gilyak", "niv"),
  GIL0("Kiribati (Gilbertese)", "Gilbertese", "gil"),
  GKP("Kpelle (Guinea)", "Guinea Kpelle", "gkp"),
  GLK("Gilaki", "Gilaki", "glk"),
  GMZ("Gumuz", "Gumuz", "guk"),
  GNN("Gumatj", "Gumatj", "gnn"),
  GOG("Gogo", "Gogo", "gog"),
  GON("Gondi", null /* ambiguous */, "gon,gno,ggo"),
  GRN("Greenlandic", "Kalaallisut", "kal"),
  GRO("Garo", "Garo", "grt"),
  GUA("Guarani", "Guarani", "grn"),
  GUC("Wayuu", "Wayuu", "guc"),
  GUF("Gupapuyngu", "Gupapuyngu", "guf"),
  GUJ("Gujarati", "Gujarati", "guj"),
  GUZ("Gusii", "Gusii", "guz"),
  HAI("Haitian (Haitian Creole)", "Haitian", "hat"),
  HAL("Halam", null /* not in ISO 639-3 */, "flm"),
  HAR("Harauti", "Hadothi", "hoj"),
  HAU("Hausa", "Hausa", "hau"),
  HAW("Hawaiian", "Hawaiian", "haw"),
  HAY("Haya", "Haya", "hay"),
  HAZ("Hazaragi", "Hazaragi", "haz"),
  HBN("Hammer-Banna", "Hamer-Banna", "amf"),
  HER("Herero", "Herero", "her"),
  HIL("Hiligaynon", "Hiligaynon", "hil"),
  HIN("Hindi", "Hindi", "hin"),
  HMA("High Mari", "Western Mari", "mrj"),
  HMN("Hmong", "Hmong", "hmn"),
  HMO("Hiri Motu", "Hiri Motu", "hmo"),
  HND("Hindko", null /* ambiguous */, "hno,hnd"),
  HO("Ho", "Ho", "hoc"),
  HRI("Harari", "Harari", "har"),
  HRV("Croatian", "Croatian", "hrv"),
  HUN("Hungarian", "Hungarian", "hun"),
  HYE("Armenian", "Armenian", "hye"),
  HYE0("Armenian East", "Armenian", "hye"),
  IBA("Iban", "Iban", "iba"),
  IBB("Ibibio", "Ibibio", "ibb"),
  IBO("Igbo", "Igbo", "ibo"),
  IJO("Ijo languages", "Izon", "ijc"),
  IDO("Ido", "Ido", "ido"),
  ILE("Interlingue", "Interlingue", "ile"),
  ILO("Ilokano", "Iloko", "ilo"),
  INA("Interlingua", "Interlingua (International Auxiliary Language Association)", "ina"),
  IND("Indonesian", "Indonesian", "ind"),
  ING("Ingush", "Ingush", "inh"),
  INU("Inuktitut", "Inuktitut", "iku"),
  IPK("Inupiat", "Inupiaq", "ipk"),
  IPPH("Phonetic transcription – IPA conventions", null /* ambiguous */, ""),
  IRI("Irish", "Irish", "gle"),
  IRT("Irish Traditional", "Irish", "gle"),
  ISL("Icelandic", "Icelandic", "isl"),
  ISM("Inari Sami", "Inari Sami", "smn"),
  ITA("Italian", "Italian", "ita"),
  IWR("Hebrew", "Hebrew", "heb"),
  JAV("Javanese", "Javanese", "jav"),
  JII("Yiddish", "Yiddish", "yid"),
  JAM("Jamaican Creole", "Jamaican Creole English", "jam"),
  JAN("Japanese", "Japanese", "jpn"),
  JBO("Lojban", "Lojban", "jbo"),
  JUD("Ladino", "Ladino", "lad"),
  JUL("Jula", "Dyula", "dyu"),
  KAB("Kabardian", "Kabardian", "kbd"),
  KAB0("Kabyle", "Kabyle", "kab"),
  KAC("Kachchi", "Kachhi", "kfr"),
  KAL("Kalenjin", "Kalenjin", "kln"),
  KAN("Kannada", "Kannada", "kan"),
  KAR("Karachay", "Karachay-Balkar", "krc"),
  KAT("Georgian", "Georgian", "kat"),
  KAZ("Kazakh", "Kazakh", "kaz"),
  KDE("Makonde", "Makonde", "kde"),
  KEA("Kabuverdianu (Crioulo)", "Kabuverdianu", "kea"),
  KEB("Kebena", "Kambaata", "ktb"),
  KEK("Kekchi", "Kekchí", "kek"),
  KGE("Khutsuri Georgian", "Georgian", "kat"),
  KHA("Khakass", "Khakas", "kjh"),
  KHK("Khanty-Kazim", "Khanty", "kca"),
  KHM("Khmer", "Central Khmer", "khm"),
  KHS("Khanty-Shurishkar", "Khanty", "kca"),
  KHT("Khamti Shan", "Khamti", "kht"),
  KHV("Khanty-Vakhi", "Khanty", "kca"),
  KHW("Khowar", "Khowar", "khw"),
  KIK("Kikuyu (Gikuyu)", "Kikuyu", "kik"),
  KIR("Kirghiz (Kyrgyz)", "Kirghiz", "kir"),
  KIS("Kisii", null /* ambiguous */, "kqs,kss"),
  KIU("Kirmanjki", "Kirmanjki (individual language)", "kiu"),
  KJD("Southern Kiwai", "Southern Kiwai", "kjd"),
  KJP("Eastern Pwo Karen", "Pwo Eastern Karen", "kjp"),
  KKN("Kokni", "Kukna", "kex"),
  KLM("Kalmyk", "Kalmyk", "xal"),
  KMB("Kamba", "Kamba (Kenya)", "kam"),
  KMN("Kumaoni", "Kumaoni", "kfy"),
  KMO("Komo", "Komo (Democratic Republic of Congo)", "kmw"),
  KMS("Komso", "Konso", "kxc"),
  KNR("Kanuri", "Kanuri", "kau"),
  KOD("Kodagu", "Kodava", "kfa"),
  KOH("Korean Old Hangul", "Middle Korean (10th-16th cent.)", "okm"),
  KOK("Konkani", "Konkani (macrolanguage)", "kok"),
  KON("Kikongo", "Kituba (Democratic Republic of Congo)", "ktu"),
  KON0("Kongo", "Kongo", "kon"),
  KOM("Komi", "Komi", "kom"),
  KOP("Komi-Permyak", "Komi-Permyak", "koi"),
  KOR("Korean", "Korean", "kor"),
  KOS("Kosraean", "Kosraean", "kos"),
  KOZ("Komi-Zyrian", "Komi-Zyrian", "kpv"),
  KPL("Kpelle", "Kpelle", "kpe"),
  KRI("Krio", "Krio", "kri"),
  KRK("Karakalpak", "Kara-Kalpak", "kaa"),
  KRL("Karelian", "Karelian", "krl"),
  KRM("Karaim", "Karaim", "kdr"),
  KRN("Karen", null /* not in ISO 639-3 */, "kar"),
  KRT("Koorete", "Koorete", "kqy"),
  KSH("Kashmiri", "Kashmiri", "kas"),
  KSH0("Ripuarian", "Kölsch", "ksh"),
  KSI("Khasi", "Khasi", "kha"),
  KSM("Kildin Sami", "Kildin Sami", "sjd"),
  KSW("S’gaw Karen", "S'gaw Karen", "ksw"),
  KUA("Kuanyama", "Kuanyama", "kua"),
  KUI("Kui", "Kui (India)", "kxu"),
  KUL("Kulvi", "Kullu Pahari", "kfx"),
  KUM("Kumyk", "Kumyk", "kum"),
  KUR("Kurdish", "Kurdish", "kur"),
  KUU("Kurukh", "Kurukh", "kru"),
  KUY("Kuy", "Kuy", "kdt"),
  KYK("Koryak", "Koryak", "kpy"),
  KYU("Western Kayah", "Western Kayah", "kyu"),
  LAD("Ladin", "Ladin", "lld"),
  LAH("Lahuli", "Gahri", "bfu"),
  LAK("Lak", "Lak", "lbe"),
  LAM("Lambani", "Lambadi", "lmn"),
  LAO("Lao", "Lao", "lao"),
  LAT("Latin", "Latin", "lat"),
  LAZ("Laz", "Laz", "lzz"),
  LCR("L-Cree", "Moose Cree", "crm"),
  LDK("Ladakhi", "Ladakhi", "lbj"),
  LEZ("Lezgi", "Lezghian", "lez"),
  LIJ("Ligurian", "Ligurian", "lij"),
  LIM("Limburgish", "Limburgan", "lim"),
  LIN("Lingala", "Lingala", "lin"),
  LIS("Lisu", "Lisu", "lis"),
  LJP("Lampung", "Lampung Api", "ljp"),
  LKI("Laki", "Laki", "lki"),
  LMA("Low Mari", "Eastern Mari", "mhr"),
  LMB("Limbu", "Limbu", "lif"),
  LMO("Lombard", "Lombard", "lmo"),
  LMW("Lomwe", "Lomwe", "ngl"),
  LOM("Loma", "Loma (Liberia)", "lom"),
  LRC("Luri", null /* ambiguous */, "lrc,luz,bqi,zum"),
  LSB("Lower Sorbian", "Lower Sorbian", "dsb"),
  LSM("Lule Sami", "Lule Sami", "smj"),
  LTH("Lithuanian", "Lithuanian", "lit"),
  LTZ("Luxembourgish", "Luxembourgish", "ltz"),
  LUA("Luba-Lulua", "Luba-Lulua", "lua"),
  LUB("Luba-Katanga", "Luba-Katanga", "lub"),
  LUG("Ganda", "Ganda", "lug"),
  LUH("Luyia", "Luyia", "luy"),
  LUO("Luo", "Luo (Kenya and Tanzania)", "luo"),
  LVI("Latvian", "Latvian", "lav"),
  MAD("Madura", "Madurese", "mad"),
  MAG("Magahi", "Magahi", "mag"),
  MAH("Marshallese", "Marshallese", "mah"),
  MAJ("Majang", "Majang", "mpe"),
  MAK("Makhuwa", "Makhuwa", "vmw"),
  MAL("Malayalam Traditional", "Malayalam", "mal"),
  MAM("Mam", "Mam", "mam"),
  MAN("Mansi", "Mansi", "mns"),
  MAP("Mapudungun", "Mapudungun", "arn"),
  MAR("Marathi", "Marathi", "mar"),
  MAW("Marwari", null /* ambiguous */, "mwr,dhd,rwr,mve,wry,mtr,swv"),
  MBN("Mbundu", "Kimbundu", "kmb"),
  MCH("Manchu", "Manchu", "mnc"),
  MCR("Moose Cree", "Moose Cree", "crm"),
  MDE("Mende", "Mende (Sierra Leone)", "men"),
  MDR("Mandar", "Mandar", "mdr"),
  MEN("Me'en", "Me'en", "mym"),
  MER("Meru", "Meru", "mer"),
  MFE("Morisyen", "Morisyen", "mfe"),
  MIN("Minangkabau", "Minangkabau", "min"),
  MIZ("Mizo", "Lushai", "lus"),
  MKD("Macedonian", "Macedonian", "mkd"),
  MKR("Makasar", "Makasar", "mak"),
  MKW("Kituba", "Kituba (Congo)", "mkw"),
  MLE("Male", "Male (Ethiopia)", "mdy"),
  MLG("Malagasy", "Malagasy", "mlg"),
  MLN("Malinke", "Western Maninkakan", "mlq"),
  MLR("Malayalam Reformed", "Malayalam", "mal"),
  MLY("Malay", "Malay (macrolanguage)", "msa"),
  MND("Mandinka", "Mandinka", "mnk"),
  MNG("Mongolian", "Mongolian", "mon"),
  MNI("Manipuri", "Manipuri", "mni"),
  MNK("Maninka", null /* ambiguous */, "man,mnk,myq,mku,msc,emk,mwk,mlq"),
  MNX("Manx", "Manx", "glv"),
  MOH("Mohawk", "Mohawk", "moh"), // Bug in ISO-14496-22:2015 (it says "mho")
  MOK("Moksha", "Moksha", "mdf"),
  MOL("Moldavian", null /* not in ISO 639-3 */, "mol"),
  MON("Mon", "Mon", "mnw"),
  MOR("Moroccan", null /* ambiguous */, ""),
  MOS("Mossi", "Mossi", "mos"),
  MRI("Maori", "Maori", "mri"),
  MTH("Maithili", "Maithili", "mai"),
  MTS("Maltese", "Maltese", "mlt"),
  MUN("Mundari", "Mundari", "unr"),
  MUS("Muscogee", "Creek", "mus"),
  MWL("Mirandese", "Mirandese", "mwl"),
  MWW("Hmong Daw", "Hmong Daw", "mww"),
  MYN("Mayan", null /* not in ISO 639-3 */, "myn"),
  MZN("Mazanderani", "Mazanderani", "mzn"),
  NAG("Naga-Assamese", "Naga Pidgin", "nag"),
  NAH("Nahuatl", null /* not in ISO 639-3 */, "nah"),
  NAN("Nanai", "Nanai", "gld"),
  NAP("Neapolitan", "Neapolitan", "nap"),
  NAS("Naskapi", "Naskapi", "nsk"),
  NAU("Nauruan", "Nauru", "nau"),
  NAV("Navajo", "Navajo", "nav"),
  NCR("N-Cree", "Swampy Cree", "csw"),
  NDB("Ndebele", null /* ambiguous */, "nbl,nde"),
  NDC("Ndau", "Ndau", "ndc"),
  NDG("Ndonga", "Ndonga", "ndo"),
  NDS("Low Saxon", "Low German", "nds"),
  NEP("Nepali", "Nepali (macrolanguage)", "nep"),
  NEW("Newari", "Newari", "new"),
  NGA("Ngbaka", "Ngbaka", "nga"),
  NGR("Nagari", null /* ambiguous */, ""),
  NHC("Norway House Cree", "Swampy Cree", "csw"),
  NIS("Nisi", null /* not in ISO 639-3 */, "dap"),
  NIU("Niuean", "Niuean", "niu"),
  NKL("Nyankole", "Nyankole", "nyn"),
  NKO("N'Ko", "N'ko", "nqo"), // Bug in ISO-14496-22:2015 (it says "ngo")
  NLD("Dutch", "Dutch", "nld"),
  NOE("Nimadi", "Nimadi", "noe"),
  NOG("Nogai", "Nogai", "nog"),
  NOR("Norwegian", "Norwegian Bokmål", "nob"),
  NOV("Novial", "Novial", "nov"),
  NSM("Northern Sami", "Northern Sami", "sme"),
  NSO("Sotho, Northern", "Pedi", "nso"),
  NTA("Northern Thai", "Northern Thai", "nod"),
  NTO("Esperanto", "Esperanto", "epo"),
  NYM("Nyamwezi", "Nyamwezi", "nym"),
  NYN("Norwegian Nynorsk (Nynorsk, Norwegian)", "Norwegian Nynorsk", "nno"),
  OCI("Occitan", "Occitan (post 1500)", "oci"),
  OCR("Oji-Cree", "Severn Ojibwa", "ojs"),
  OJB("Ojibway", "Ojibwa", "oji"),
  ORI("Odia (formerly Oriya)", "Oriya (macrolanguage)", "ori"),
  ORO("Oromo", "Oromo", "orm"),
  OSS("Ossetian", "Ossetian", "oss"),
  PAA("Palestinian Aramaic", "Samaritan Aramaic", "sam"),
  PAG("Pangasinan", "Pangasinan", "pag"),
  PAL("Pali", "Pali", "pli"),
  PAM("Pampangan", "Pampanga", "pam"),
  PAN("Punjabi", "Panjabi", "pan"),
  PAP("Palpa", "Palpa", "plp"),
  PAP0("Papiamentu", "Papiamento", "pap"),
  PAS("Pashto", "Pushto", "pus"),
  PAU("Palauan", "Palauan", "pau"),
  PCC("Bouyei", "Bouyei", "pcc"),
  PCD("Picard", "Picard", "pcd"),
  PDC("Pennsylvania German", "Pennsylvania German", "pdc"),
  PGR("Polytonic Greek", "Modern Greek (1453-)", "ell"),
  PHK("Phake", "Phake", "phk"),
  PIH("Norfolk", "Pitcairn-Norfolk", "pih"),
  PIL("Filipino", "Filipino", "fil"),
  PLG("Palaung", null /* ambiguous */, "pce,rbb,pll"),
  PLK("Polish", "Polish", "pol"),
  PMS("Piemontese", "Piemontese", "pms"),
  PNB("Western Panjabi", "Western Panjabi", "pnb"),
  POH("Pocomchi", "Poqomchi'", "poh"),
  PON("Pohnpeian", "Pohnpeian", "pon"),
  PRO("Provencal", "Old Provençal (to 1500)", "pro"),
  PTG("Portuguese", "Portuguese", "por"),
  PWO("Western Pwo Karen", "Pwo Western Karen", "pwo"),
  QIN("Chin", null /* ambiguous */, ""
          + "bgr,cnh,cnw,czt,sez,tcp,csy,ctd,flm,pck,"
          + "tcz,zom,cmr,dao,hlt,cka,cnk,mrh,mwg,cbl,"
          + "cnb,csh"),
  QUC("K’iche’", "K'iche'", "quc"),
  QUH("Quechua (Bolivia)", "South Bolivian Quechua", "quh"),
  QUZ("Quechua", "Cusco Quechua", "quz"),
  QVI("Quechua (Ecuador)", "Imbabura Highland Quichua", "qvi"),
  QWH("Quechua (Peru)", "Huaylas Ancash Quechua", "qwh"),
  RAJ("Rajasthani", "Rajasthani", "raj"),
  RAR("Rarotongan", "Rarotongan", "rar"),
  RCR("R-Cree", "Atikamekw", "atj"),
  RBU("Russian Buriat", "Russia Buriat", "bxr"),
  REJ("Rejang", "Rejang", "rej"),
  RIA("Riang", "Riang (India)", "ria"),
  RIF("Tarifit", "Tarifit", "rif"),
  RIT("Ritarungo", "Ritarungo", "rit"),
  RKW("Arakwal", "Arakwal", "rkw"),
  RMS("Romansh", "Romansh", "roh"),
  RMY("Vlax Romani", "Vlax Romani", "rmy"),
  ROM("Romanian", "Romanian", "ron"),
  ROY("Romany", "Romany", "rom"),
  RSY("Rusyn", "Rusyn", "rue"),
  RTM("Rotuman", "Rotuman", "rtm"),
  RUA("Kinyarwanda", "Kinyarwanda", "kin"),
  RUN("Rundi", "Rundi", "run"),
  RUP("Aromanian", "Macedo-Romanian", "rup"),
  RUS("Russian", "Russian", "rus"),
  SAD("Sadri", "Sadri", "sck"),
  SAN("Sanskrit", "Sanskrit", "san"),
  SAS("Sasak", "Sasak", "sas"),
  SAT("Santali", "Santali", "sat"),
  SAY("Sayisi", "Chipewyan", "chp"),
  SCN("Sicilian", "Sicilian", "scn"),
  SCO("Scots", "Scots", "sco"),
  SEK("Sekota", "Xamtanga", "xan"),
  SEL("Selkup", "Selkup", "sel"),
  SGA("Old Irish", "Old Irish (to 900)", "sga"),
  SGO("Sango", "Sango", "sag"),
  SGS("Samogitian", "Samogitian", "sgs"),
  SHI("Tachelhit", "Tachelhit", "shi"),
  SHN("Shan", "Shan", "shn"),
  SIB("Sibe", "Xibe", "sjo"),
  SID("Sidamo", "Sidamo", "sid"),
  SIG("Silte Gurage", null /* not in ISO 639-3 */, "xst"),
  SKS("Skolt Sami", "Skolt Sami", "sms"),
  SKY("Slovak", "Slovak", "slk"),
  SLA("Slavey", "North Slavey", "scs"),
  SLV("Slovenian", "Slovenian", "slv"),
  SML("Somali", "Somali", "som"),
  SMO("Samoan", "Samoan", "smo"),
  SNA("Sena", "Sheko", "she"),
  SNA0("Shona", "Shona", "sna"),
  SND("Sindhi", "Sindhi", "snd"),
  SNH("Sinhala (Sinhalese)", "Sinhala", "sin"),
  SNK("Soninke", "Soninke", "snk"),
  SOG("Sodo Gurage", "Kistane", "gru"),
  SOP("Songe", "Songe", "sop"),
  SOT("Sotho, Southern", "Southern Sotho", "sot"),
  SQI("Albanian", "Swiss German", "gsw"),
  SRB("Serbian", "Serbian", "srp"),
  SRD("Sardinian", "Sardinian", "srd"),
  SRK("Seraiki", "Saraiki", "skr"),
  SRR("Serer", "Serer", "srr"),
  SSL("South Slavey", "South Slavey", "xsl"),
  SSM("Southern Sami", "Southern Sami", "sma"),
  STQ("Saterland Frisian", "Saterfriesisch", "stq"),
  SUK("Sukuma", "Sukuma", "suk"),
  SUN("Sundanese", "Sundanese", "sun"),
  SUR("Suri", "Suri", "suq"),
  SVA("Svan", "Svan", "sva"),
  SVE("Swedish", "Swedish", "swe"),
  SWA("Swadaya Aramaic", "Assyrian Neo-Aramaic", "aii"),
  SWK("Swahili", "Swahili (macrolanguage)", "swa"),
  SWZ("Swati", "Swati", "ssw"),
  SXT("Sutu", "Ngoni", "ngo"),
  SXU("Upper Saxon", "Upper Saxon", "sxu"),
  SYL("Sylheti", "Sylheti", "syl"),
  SYR("Syriac", "Syriac", "syr"),
  SZL("Silesian", "Silesian", "szl"),
  TAB("Tabasaran", "Tabassaran", "tab"),
  TAJ("Tajik", "Tajik", "tgk"),
  TAM("Tamil", "Tamil", "tam"),
  TAT("Tatar", "Tatar", "tat"),
  TCR("TH-Cree", "Woods Cree", "cwd"),
  TDD("Dehong Dai", "Tai Nüa", "tdd"),
  TEL("Telugu", "Telugu", "tel"),
  TET("Tetum", "Tetum", "tet"),
  TGL("Tagalog", "Tagalog", "tgl"),
  TGN("Tongan", "Tonga (Tonga Islands)", "ton"),
  TGR("Tigre", "Tigre", "tig"),
  TGY("Tigrinya", "Tigrinya", "tir"),
  THA("Thai", "Thai", "tha"),
  THT("Tahitian", "Tahitian", "tah"),
  TIB("Tibetan", "Tibetan", "bod"),
  TIV("Tiv", "Tiv", "tiv"),
  TKM("Turkmen", "Turkmen", "tuk"),
  TMH("Tamashek", "Tamashek", "tmh"),
  TMN("Temne", "Timne", "tem"),
  TNA("Tswana", "Tswana", "tsn"),
  TNE("Tundra Nenets", "Tundra Enets", "enh"),
  TNG("Tonga", "Tonga (Zambia)", "toi"),
  TOD("Todo", "Kalmyk", "xal"),
  TOD0("Toma", "Toma", "tod"),
  TPI("Tok Pisin", "Tok Pisin", "tpi"),
  TRK("Turkish", "Turkish", "tur"),
  TSG("Tsonga", "Tsonga", "tso"),
  TUA("Turoyo Aramaic", "Turoyo", "tru"),
  TUL("Tulu", "Tulu", "tcy"),
  TUM("Tumbuka", "Tumbuka", "tum"),
  TUV("Tuvin", "Tuvinian", "tyv"),
  TVL("Tuvalu", "Tuvalu", "tvl"),
  TWI("Twi", "Twi", "twi"),
  TYZ("Tày", "Tày", "tyz"),
  TZM("Tamazight", "Central Atlas Tamazight", "tzm"),
  TZO("Tzotzil", "Tzotzil", "tzo"),
  UDM("Udmurt", "Udmurt", "udm"),
  UKR("Ukrainian", "Ukrainian", "ukr"),
  UMB("Umbundu", "Umbundu", "umb"),
  URD("Urdu", "Urdu", "urd"),
  USB("Upper Sorbian", "Upper Sorbian", "hsb"),
  UYG("Uyghur", "Uighur", "uig"),
  UZB("Uzbek", null /* ambiguous */, "uzb,uzn,uzs"),
  VEC("Venetian", "Venetian", "vec"),
  VEN("Venda", "Venda", "ven"),
  VIT("Vietnamese", "Vietnamese", "vie"),
  VOL("Volapük", "Volapük", "vol"),
  VRO("Võro", "Võro", "vro"),
  WA("Wa", "Wa", "wbm"),
  WAG("Wagdi", "Wagdi", "wbr"),
  WAR("Waray-Waray", "Waray (Philippines)", "war"),
  WCR("West-Cree", "Plains Cree", "crk"),
  WEL("Welsh", "Welsh", "cym"),
  WLN("Walloon", "Walloon", "wln"),
  WLF("Wolof", "Wolof", "wol"),
  WTM("Mewati", "Mewati", "wtm"),
  XBD("Lü", "Lü", "khb"),
  XHS("Xhosa", "Xhosa", "xho"),
  XJB("Minjangbal", "Minjungbal", "xjb"),
  XOG("Soga", "Soga", "xog"),
  XPE("Kpelle (Liberia)", "Liberia Kpelle", "xpe"),
  YAK("Sakha", "Yakut", "sah"),
  YAO("Yao", "Yao", "yao"),
  YAP("Yapese", "Yapese", "yap"),
  YBA("Yoruba", "Yoruba", "yor"),
  YCR("Y-Cree", "Cree", "cre"),
  YIC("Yi Classic", null /* ambiguous */, ""),
  YIM("Yi Modern", "Sichuan Yi", "iii"),
  ZEA("Zealandic", "Zeeuws", "zea"),
  ZGH("Standard Morrocan Tamazigh", "Standard Moroccan Tamazight", "zgh"),
  ZHA("Zhuang", "Zhuang", "zha"),
  ZHH("Chinese, Hong Kong SAR", "Chinese", "zho"),
  ZHP("Chinese Phonetic", "Chinese", "zho"),
  ZHS("Chinese Simplified", "Chinese", "zho"),
  ZHT("Chinese Traditional", "Chinese", "zho"),
  ZND("Zande", "Zande (individual language)", "zne"),
  ZUL("Zulu", "Zulu", "zul"),
  ZZA("Zazaki", "Zaza", "zza"),

  CHN("Chinese -- as seen in win7 kaiu.ttf", "Chinese", "zho"),
  DFLT("default", null /* ambiguous */, ""),
  KHN("Khun(?)", "Khün", "kkh"),

  de("German found in FreeSerif.ttf", "German", "deu"),
  nl("Dutch found in FreeSansBoldOblique.ttf", "Dutch", "nld"),
  tmh("Tamashek found in ebrimabd.ttf", "Tamashek", "tmh");

  private final int tag;
  private final String languageSystem;
  final String iso3List;
  private final String iso639Name;

  LanguageTag(String languageSystem, String iso639Name, String iso3List) {
    this.tag = Tag.intValue((name() + "    ").substring(0, 4));
    this.languageSystem = languageSystem;
    this.iso639Name = iso639Name;
    this.iso3List = iso3List;
  }

  public int tag() {
    return tag;
  }

  /** The language system, as given in the OpenType standard. */
  public String languageSystem() {
    return languageSystem;
  }

  public String iso639Name() {
    return iso639Name;
  }

  public boolean isDeprecated() {
    return this == DHV;
  }

  public List<String> iso3List() {
    if (iso3List.isEmpty()) {
      return Collections.<String>emptyList();
    } else {
      return Arrays.<String>asList(iso3List.split(","));
    }
  }

  static LanguageTag fromTag(int tag) {
    for (LanguageTag script : LanguageTag.values()) {
      if (script.tag == tag) {
        return script;
      }
    }
    throw new IllegalArgumentException(Tag.stringValue(tag));
  }
}
