package edu.ucsd.crbs.probabilitymapviewer.slice;

/**
 * Daemon that converts data from image of some type to slice
 * @author churas
 */
public interface SliceConverterDaemon extends Runnable {

    /**
     * Runs the daemon
     */
    @Override
    public void run();
    
    /**
     * Tells daemon to shutdown
     */
    public void shutdown();

    /**
     * Returns the destination directory for the converted slices
     * @return Path to converted slices
     */
    public String getDestinationDirectory();

}
