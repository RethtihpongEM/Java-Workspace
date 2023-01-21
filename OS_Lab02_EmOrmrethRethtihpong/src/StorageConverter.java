public class StorageConverter {
  public static double byte2KB(long numByte){
    return (double)numByte/1024;
  }
  public static double byte2MB(long numByte){
    return byte2KB(numByte)/1024;
  }
  public static double byte2GB(long numByte){
    return byte2MB(numByte)/1024;
  }
  public static double byte2TB(long numByte){
    return byte2GB(numByte)/1024;
  }
  public static double byte2PB(long numByte){
    return byte2TB(numByte)/1024;
  }

  public static double kb2Byte(long kilobyte){
    return kilobyte*1024;
  }
  public static double kb2MB(long kilobyte){
    return (double) kilobyte/1024;
  }
  public static double kb2GB(long kilobyte){
    return kb2MB(kilobyte)/1024;
  }
  public static double kb2TB(long kilobyte){
    return kb2GB(kilobyte)/1024;
  }
  public static double kb2PB(long kilobyte){
    return kb2TB(kilobyte)/1024;
  }
  public static double mb2Byte(long megabyte){
    return mb2KB(megabyte)*1024;
  }
  public static double mb2KB(long megabyte){
    return megabyte*1024;
  }
  public static double mb2GB(long megabyte){
    return (double) megabyte/1024;
  }
  public static double mb2TB(long megabyte){
    return mb2GB(megabyte)/1024;
  }
  public static double mb2PB(long megabyte){
    return mb2TB(megabyte)/1024;
  }
  public static double gb2Byte(long gigabyte){
    return gb2KB(gigabyte)*1024;
  }
  public static double gb2KB(long gigabyte){
    return gb2MB(gigabyte)*1024;
  }
  public static double gb2MB(long gigabyte){
    return gigabyte*1024;
  }
  public static double gb2TB(long gigabyte){
    return (double) gigabyte/1024;
  }
  public static double gb2PB(long gigabyte){
    return gb2TB(gigabyte)/1024;
  }
}
