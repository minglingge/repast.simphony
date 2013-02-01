package repast.simphony.systemdynamics.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import repast.simphony.systemdynamics.diagram.edit.parts.CloudEditPart;
import repast.simphony.systemdynamics.diagram.edit.parts.StockEditPart;
import repast.simphony.systemdynamics.diagram.edit.parts.SystemModelEditPart;
import repast.simphony.systemdynamics.diagram.edit.parts.Variable2EditPart;
import repast.simphony.systemdynamics.diagram.edit.parts.Variable3EditPart;
import repast.simphony.systemdynamics.diagram.edit.parts.VariableEditPart;
import repast.simphony.systemdynamics.diagram.part.Messages;
import repast.simphony.systemdynamics.diagram.part.SystemdynamicsDiagramEditorPlugin;

/**
 * @generated
 */
public class SystemdynamicsModelingAssistantProvider extends ModelingAssistantProvider {

  /**
   * @generated
   */
  public List getTypesForPopupBar(IAdaptable host) {
    IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
    if (editPart instanceof SystemModelEditPart) {
      ArrayList<IElementType> types = new ArrayList<IElementType>(5);
      types.add(SystemdynamicsElementTypes.Variable_2001);
      types.add(SystemdynamicsElementTypes.Cloud_2002);
      types.add(SystemdynamicsElementTypes.Stock_2003);
      types.add(SystemdynamicsElementTypes.Variable_2004);
      types.add(SystemdynamicsElementTypes.Variable_2005);
      return types;
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public List getRelTypesOnSource(IAdaptable source) {
    IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
        .getAdapter(IGraphicalEditPart.class);
    if (sourceEditPart instanceof VariableEditPart) {
      return ((VariableEditPart) sourceEditPart).getMARelTypesOnSource();
    }
    if (sourceEditPart instanceof CloudEditPart) {
      return ((CloudEditPart) sourceEditPart).getMARelTypesOnSource();
    }
    if (sourceEditPart instanceof StockEditPart) {
      return ((StockEditPart) sourceEditPart).getMARelTypesOnSource();
    }
    if (sourceEditPart instanceof Variable2EditPart) {
      return ((Variable2EditPart) sourceEditPart).getMARelTypesOnSource();
    }
    if (sourceEditPart instanceof Variable3EditPart) {
      return ((Variable3EditPart) sourceEditPart).getMARelTypesOnSource();
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public List getRelTypesOnTarget(IAdaptable target) {
    IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
        .getAdapter(IGraphicalEditPart.class);
    if (targetEditPart instanceof VariableEditPart) {
      return ((VariableEditPart) targetEditPart).getMARelTypesOnTarget();
    }
    if (targetEditPart instanceof CloudEditPart) {
      return ((CloudEditPart) targetEditPart).getMARelTypesOnTarget();
    }
    if (targetEditPart instanceof StockEditPart) {
      return ((StockEditPart) targetEditPart).getMARelTypesOnTarget();
    }
    if (targetEditPart instanceof Variable2EditPart) {
      return ((Variable2EditPart) targetEditPart).getMARelTypesOnTarget();
    }
    if (targetEditPart instanceof Variable3EditPart) {
      return ((Variable3EditPart) targetEditPart).getMARelTypesOnTarget();
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
    IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
        .getAdapter(IGraphicalEditPart.class);
    IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
        .getAdapter(IGraphicalEditPart.class);
    if (sourceEditPart instanceof VariableEditPart) {
      return ((VariableEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
    }
    if (sourceEditPart instanceof CloudEditPart) {
      return ((CloudEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
    }
    if (sourceEditPart instanceof StockEditPart) {
      return ((StockEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
    }
    if (sourceEditPart instanceof Variable2EditPart) {
      return ((Variable2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
    }
    if (sourceEditPart instanceof Variable3EditPart) {
      return ((Variable3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
    IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
        .getAdapter(IGraphicalEditPart.class);
    if (targetEditPart instanceof VariableEditPart) {
      return ((VariableEditPart) targetEditPart).getMATypesForSource(relationshipType);
    }
    if (targetEditPart instanceof CloudEditPart) {
      return ((CloudEditPart) targetEditPart).getMATypesForSource(relationshipType);
    }
    if (targetEditPart instanceof StockEditPart) {
      return ((StockEditPart) targetEditPart).getMATypesForSource(relationshipType);
    }
    if (targetEditPart instanceof Variable2EditPart) {
      return ((Variable2EditPart) targetEditPart).getMATypesForSource(relationshipType);
    }
    if (targetEditPart instanceof Variable3EditPart) {
      return ((Variable3EditPart) targetEditPart).getMATypesForSource(relationshipType);
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
    IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
        .getAdapter(IGraphicalEditPart.class);
    if (sourceEditPart instanceof VariableEditPart) {
      return ((VariableEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
    }
    if (sourceEditPart instanceof CloudEditPart) {
      return ((CloudEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
    }
    if (sourceEditPart instanceof StockEditPart) {
      return ((StockEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
    }
    if (sourceEditPart instanceof Variable2EditPart) {
      return ((Variable2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
    }
    if (sourceEditPart instanceof Variable3EditPart) {
      return ((Variable3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @generated
   */
  public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
    return selectExistingElement(target, getTypesForSource(target, relationshipType));
  }

  /**
   * @generated
   */
  public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
    return selectExistingElement(source, getTypesForTarget(source, relationshipType));
  }

  /**
   * @generated
   */
  protected EObject selectExistingElement(IAdaptable host, Collection types) {
    if (types.isEmpty()) {
      return null;
    }
    IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
    if (editPart == null) {
      return null;
    }
    Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
    HashSet<EObject> elements = new HashSet<EObject>();
    for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
      EObject element = it.next();
      if (isApplicableElement(element, types)) {
        elements.add(element);
      }
    }
    if (elements.isEmpty()) {
      return null;
    }
    return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
  }

  /**
   * @generated
   */
  protected boolean isApplicableElement(EObject element, Collection types) {
    IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
    return types.contains(type);
  }

  /**
   * @generated
   */
  protected EObject selectElement(EObject[] elements) {
    Shell shell = Display.getCurrent().getActiveShell();
    ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
        SystemdynamicsDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
    ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
    dialog.setMessage(Messages.SystemdynamicsModelingAssistantProviderMessage);
    dialog.setTitle(Messages.SystemdynamicsModelingAssistantProviderTitle);
    dialog.setMultipleSelection(false);
    dialog.setElements(elements);
    EObject selected = null;
    if (dialog.open() == Window.OK) {
      selected = (EObject) dialog.getFirstResult();
    }
    return selected;
  }
}