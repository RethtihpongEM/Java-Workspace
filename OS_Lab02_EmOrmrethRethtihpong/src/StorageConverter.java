/**
 * Class to create storage
 * Byte, Kilobyte, Megabyte, Gigabyte, Terabyte, Petabyte
 */
public class StorageConverter {
  public static double byte2KB(long numByte){
    /*
     * Convert byte to kilobyte
     */
    return (double)numByte/1024;
  }
  public static double byte2MB(long numByte){
    /*
     * Convert byte to megabyte
     */
    return byte2KB(numByte)/1024;
  }
  public static double byte2GB(long numByte){
    /*
     * Convert byte to gigabyte
     */
    return byte2MB(numByte)/1024;
  }
  public static double byte2TB(long numByte){
    /*
     * Convert byte to terabyte
     */
    return byte2GB(numByte)/1024;
  }
  public static double byte2PB(long numByte){
    /*
     * Convert byte to petabyte
     */
    return byte2TB(numByte)/1024;
  }

  public static double kb2Byte(long kilobyte){
    /*
     * Convert kilobyte to byte
     */
    return kilobyte*1024;
  }
  public static double kb2MB(long kilobyte){
    /*
     * Convert kilobyte to megabyte
     */
    return (double) kilobyte/1024;
  }
  public static double kb2GB(long kilobyte){
    /*
     * Convert kilobyte to gigabyte
     */
    return kb2MB(kilobyte)/1024;
  }
  public static double kb2TB(long kilobyte){
    /*
     * Convert kilobyte to terabyte
     */
    return kb2GB(kilobyte)/1024;
  }
  public static double kb2PB(long kilobyte){
    /*
     * Convert kilobyte to petabyte
     */
    return kb2TB(kilobyte)/1024;
  }
  public static double mb2Byte(long megabyte){
    /*
     * Convert megabyte to byte
     */
    return mb2KB(megabyte)*1024;
  }
  public static double mb2KB(long megabyte){
    /*
     * Convert megabyte to kilobyte
     */
    return megabyte*1024;
  }
  public static double mb2GB(long megabyte){
    /*
     * Convert megabyte to gigabyte
     */
    return (double) megabyte/1024;
  }
  public static double mb2TB(long megabyte){
    /*
     * Convert megabyte to terabyte
     */
    return mb2GB(megabyte)/1024;
  }
  public static double mb2PB(long megabyte){
    /*
     * Convert megabyte to petabyte
     */
    return mb2TB(megabyte)/1024;
  }
  public static double gb2Byte(long gigabyte){
    /*
     * Convert gigabyte to byte
     */
    return gb2KB(gigabyte)*1024;
  }
  public static double gb2KB(long gigabyte){
    /*
     * Convert gigabyte to kilobyte
     */
    return gb2MB(gigabyte)*1024;
  }
  public static double gb2MB(long gigabyte){
    /*
     * Convert gigabyte to megabyte
     */
    return gigabyte*1024;
  }
  public static double gb2TB(long gigabyte){
    /*
     * Convert gigabyte to terabyte
     */
    return (double) gigabyte/1024;
  }
  public static double gb2PB(long gigabyte){
    /*
     * Convert gigabyte to petabyte
     */
    return gb2TB(gigabyte)/1024;
  }
  public static double tb2Byte(long terabyte){
    /*
     * Convert terabyte to byte
     */
    return tb2KB(terabyte)*1024;
  }
  public static double tb2KB(long terabyte){
    /*
     * Convert terabyte to kilobyte
     */
    return tb2MB(terabyte)*1024;
  }
  public static double tb2MB(long terabyte){
    /*
     * Convert terabyte to megabyte
     */
    return tb2GB(terabyte)*1024;
  }
  public static double tb2GB(long terabyte){
    /*
     * Convert terabyte to gigabyte
     */
    return terabyte*1024;
  }
  public static double tb2PB(long terabyte){
    /*
     * Convert terabyte to petabyte
     */
    return (double) terabyte*1024;
  }
  public static double pb2Byte(long petabyte){
    /*
     * Convert petabyte to byte
     */
    return pb2KB(petabyte)*1024;
  }
  public static double pb2KB(long petabyte){
    /*
     * Convert petabyte to kilobyte
     */
    return pb2MB(petabyte)*1024;
  }
  public static double pb2MB(long petabyte){
    /*
     * Convert petabyte to megabyte
     */
    return pb2GB(petabyte)*1024;
  }
  public static double pb2GB(long petabyte){
    /*
     * Convert petabyte to gigabyte
     */
    return pb2TB(petabyte)*1024;
  }
  public static double pb2TB(long petabyte){
    /*
     * Convert petabyte to terabyte
     */
    return petabyte*1024;
  }
}
