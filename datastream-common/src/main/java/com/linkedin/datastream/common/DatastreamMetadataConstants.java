package com.linkedin.datastream.common;

/**
 * Various well known config keys used in datastream metadata.
 */
public class DatastreamMetadataConstants {

  /**
   * Represents whether the datastream has an User managed destination (a.k.a BYOT - Bring your own topic)
   */
  public static final String IS_USER_MANAGED_DESTINATION_KEY = "system.IsUserManagedDestination";

  /**
   * Whether the datastream should reuse existing datastream's destination if it is available.
   */
  public static final String REUSE_EXISTING_DESTINATION_KEY = "system.reuseExistingDestination";

  /**
   * Represents datastream owner
   */
  public static final String OWNER_KEY = "owner";

  /**
   * Task prefix used for identifying all the tasks corresponding to the datastream.
   */
  public static final String TASK_PREFIX = "system.taskPrefix";

  /**
   * Timestamp in Epoch-millis when destination was created
   */
  public static final String DESTINATION_CREATION_MS = "system.destination.creation.ms";

  /**
   * Duration in Epoch-millis before destination starts to delete messages
   */
  public static final String DESTINATION_RETENION_MS = "system.destination.retention.ms";

  /**
   * Timestamp of datastream creation in epoch-milis
   */
  public static final String CREATION_MS = "system.creation.ms";
}
