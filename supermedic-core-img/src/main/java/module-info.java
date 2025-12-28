module org.supermedic.core.img {
  requires java.desktop;
  requires java.xml;
  requires org.slf4j;

  opens org.opencv.osgi; // Allow reflective access for native code loading

  exports org.supermedic.core.util;
  exports org.supermedic.core.util.annotations;
  exports org.supermedic.opencv.op;
  exports org.supermedic.opencv.op.lut;
  exports org.supermedic.opencv.data;
  exports org.supermedic.opencv.seg;
  exports org.opencv.core;
  exports org.opencv.img_hash;
  exports org.opencv.imgcodecs;
  exports org.opencv.imgproc;
  exports org.opencv.osgi;
  exports org.opencv.utils;
}
