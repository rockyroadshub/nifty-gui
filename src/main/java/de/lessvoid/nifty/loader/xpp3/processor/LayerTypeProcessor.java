package de.lessvoid.nifty.loader.xpp3.processor;

import de.lessvoid.nifty.loader.xpp3.Attributes;
import de.lessvoid.nifty.loader.xpp3.XmlParser;
import de.lessvoid.nifty.loader.xpp3.elements.LayerType;
import de.lessvoid.nifty.loader.xpp3.elements.ScreenType;
import de.lessvoid.nifty.loader.xpp3.processor.helper.ProcessorHelper;


/**
 * LayerType.
 * @author void
 */
public class LayerTypeProcessor implements XmlElementProcessor {

  /**
   * screen.
   */
  private ScreenType screen;

  /**
   * LayerTypeProcessor.
   * @param screenParam screen
   */
  public LayerTypeProcessor(final ScreenType screenParam) {
    this.screen = screenParam;
  }

  /**
   * process.
   * @param xmlParser XmlParser
   * @param attributes attributes
   * @throws Exception exception
   */
  public void process(final XmlParser xmlParser, final Attributes attributes) throws Exception {
    LayerType layer = new LayerType();
    ProcessorHelper.processElement(xmlParser, layer, attributes);
    screen.addLayer(layer);
  }
}
