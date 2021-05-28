/**
 * generated by Xtext 2.25.0
 */
package org.xtext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.registrationDSL.Add;
import org.xtext.registrationDSL.And;
import org.xtext.registrationDSL.Attribute;
import org.xtext.registrationDSL.Comparison;
import org.xtext.registrationDSL.Constant;
import org.xtext.registrationDSL.Div;
import org.xtext.registrationDSL.Entity;
import org.xtext.registrationDSL.Expression;
import org.xtext.registrationDSL.External;
import org.xtext.registrationDSL.ExternalCall;
import org.xtext.registrationDSL.LogicExp;
import org.xtext.registrationDSL.Minus;
import org.xtext.registrationDSL.Mult;
import org.xtext.registrationDSL.Or;
import org.xtext.registrationDSL.Plus;
import org.xtext.registrationDSL.Registationsystem;
import org.xtext.registrationDSL.Register;
import org.xtext.registrationDSL.Relation;
import org.xtext.registrationDSL.Require;
import org.xtext.registrationDSL.Select;
import org.xtext.registrationDSL.Statement;
import org.xtext.registrationDSL.Variable;
import org.xtext.registrationDSL.Workflow;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RegistrationDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Registationsystem modelInstance = Iterators.<Registationsystem>filter(resource.getAllContents(), Registationsystem.class).next();
    this.display(modelInstance);
    final Consumer<Entity> _function = (Entity it) -> {
      this.generateEntityFile(it, modelInstance.getName(), fsa);
    };
    Iterables.<Entity>filter(modelInstance.getDeclarations(), Entity.class).forEach(_function);
    this.generateWorkflowFile(Iterables.<Workflow>filter(modelInstance.getDeclarations(), Workflow.class), modelInstance.getName(), Iterables.<Entity>filter(modelInstance.getDeclarations(), Entity.class), fsa);
    this.generateExternals(modelInstance, fsa);
  }
  
  public void generateEntityFile(final Entity entity, final String systemName, final IFileSystemAccess2 fsa) {
    String _lowerCase = systemName.toLowerCase();
    String _plus = (_lowerCase + "/");
    String _name = entity.getName();
    String _plus_1 = (_plus + _name);
    String _plus_2 = (_plus_1 + ".java");
    fsa.generateFile(_plus_2, this.generateEntity(entity, systemName));
  }
  
  public CharSequence generateEntity(final Entity entity, final String systemName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _lowerCase = systemName.toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = entity.getName();
    _builder.append(_name);
    {
      Entity _base = entity.getBase();
      boolean _tripleNotEquals = (_base != null);
      if (_tripleNotEquals) {
        _builder.append(" extends ");
        String _name_1 = entity.getBase().getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private External code;");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateConstructor = this.generateConstructor(entity);
    _builder.append(_generateConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//ad relations and atributes");
    _builder.newLine();
    {
      Iterable<Attribute> _filter = Iterables.<Attribute>filter(entity.getFields(), Attribute.class);
      for(final Attribute a : _filter) {
        _builder.append("\t");
        _builder.append("protected ");
        String _type = a.getType();
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _name_2 = a.getName();
        _builder.append(_name_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _type_1 = a.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" get");
        String _firstUpper = StringExtensions.toFirstUpper(a.getName());
        _builder.append(_firstUpper, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_3 = a.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(a.getName());
        _builder.append(_firstUpper_1, "\t");
        _builder.append("(");
        String _type_2 = a.getType();
        _builder.append(_type_2, "\t");
        _builder.append(" value){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_4 = a.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append(" = value;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    {
      Iterable<Relation> _filter_1 = Iterables.<Relation>filter(entity.getFields(), Relation.class);
      for(final Relation r : _filter_1) {
        _builder.append("\t");
        _builder.append("protected ArrayList<");
        String _name_5 = r.getTarget().getName();
        _builder.append(_name_5, "\t");
        _builder.append("> ");
        String _name_6 = r.getName();
        _builder.append(_name_6, "\t");
        _builder.append(" = new ArrayList<>();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ArrayList<");
        String _firstUpper_2 = StringExtensions.toFirstUpper(r.getTarget().getName());
        _builder.append(_firstUpper_2, "\t");
        _builder.append("> get");
        String _firstUpper_3 = StringExtensions.toFirstUpper(r.getName());
        _builder.append(_firstUpper_3, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_7 = r.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void add");
        String _firstUpper_4 = StringExtensions.toFirstUpper(r.getName());
        _builder.append(_firstUpper_4, "\t");
        _builder.append("(");
        String _firstUpper_5 = StringExtensions.toFirstUpper(r.getTarget().getName());
        _builder.append(_firstUpper_5, "\t");
        _builder.append(" target){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_8 = r.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append(".add(target);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("private void checkRequirements() throws Exception {");
    _builder.newLine();
    {
      Iterable<Require> _filter_2 = Iterables.<Require>filter(entity.getFields(), Require.class);
      for(final Require r_1 : _filter_2) {
        _builder.append("\t\t\t");
        _builder.append("if(!(");
        CharSequence _generateRequire = this.generateRequire(r_1);
        _builder.append(_generateRequire, "\t\t\t");
        _builder.append(")) throw new Exception(\"Requirement ");
        CharSequence _generateLogicExp = this.generateLogicExp(r_1.getLogic());
        _builder.append(_generateLogicExp, "\t\t\t");
        _builder.append(" not satisfied\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateConstructor(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("(External code, ");
    {
      ArrayList<Attribute> _allAtributeFields = this.allAtributeFields(entity);
      boolean _hasElements = false;
      for(final Attribute a : _allAtributeFields) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _type = a.getType();
        _builder.append(_type);
        _builder.append(" ");
        String _name_1 = a.getName();
        _builder.append(_name_1);
      }
    }
    _builder.append(") throws Exception {");
    _builder.newLineIfNotEmpty();
    {
      Entity _base = entity.getBase();
      boolean _tripleNotEquals = (_base != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("super(code, ");
        {
          ArrayList<Attribute> _allAtributeFields_1 = this.allAtributeFields(entity.getBase());
          boolean _hasElements_1 = false;
          for(final Attribute a_1 : _allAtributeFields_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _name_2 = a_1.getName();
            _builder.append(_name_2, "\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("this.code = code;");
    _builder.newLine();
    {
      Iterable<Attribute> _filter = Iterables.<Attribute>filter(entity.getFields(), Attribute.class);
      for(final Attribute a_2 : _filter) {
        _builder.append("\t");
        _builder.append("this.");
        String _name_3 = a_2.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" = ");
        String _name_4 = a_2.getName();
        _builder.append(_name_4, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("checkRequirements();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public ArrayList<Attribute> allAtributeFields(final Entity entity) {
    ArrayList<Attribute> _xblockexpression = null;
    {
      final ArrayList<Attribute> result = new ArrayList<Attribute>();
      Entity currentEntity = entity;
      while ((currentEntity != null)) {
        {
          Iterables.<Attribute>addAll(result, Iterables.<Attribute>filter(currentEntity.getFields(), Attribute.class));
          currentEntity = currentEntity.getBase();
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateRequire(final Require require) {
    return this.generateLogicExp(require.getLogic());
  }
  
  protected CharSequence _generateLogicExp(final And exp) {
    CharSequence _generateLogicExp = this.generateLogicExp(exp.getLeft());
    String _plus = (_generateLogicExp + "&&");
    CharSequence _generateLogicExp_1 = this.generateLogicExp(exp.getRight());
    return (_plus + _generateLogicExp_1);
  }
  
  protected CharSequence _generateLogicExp(final Or exp) {
    CharSequence _generateLogicExp = this.generateLogicExp(exp.getLeft());
    String _plus = (_generateLogicExp + "||");
    CharSequence _generateLogicExp_1 = this.generateLogicExp(exp.getRight());
    return (_plus + _generateLogicExp_1);
  }
  
  protected CharSequence _generateLogicExp(final Comparison exp) {
    CharSequence _generateMExp = this.generateMExp(exp.getLeft());
    String _op = exp.getOp();
    String _plus = (_generateMExp + _op);
    CharSequence _generateMExp_1 = this.generateMExp(exp.getRight());
    return (_plus + _generateMExp_1);
  }
  
  protected CharSequence _generateLogicExp(final ExternalCall ec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.code.");
    String _name = ec.getTarget().getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Expression> _arguments = ec.getArguments();
      boolean _hasElements = false;
      for(final Expression arg : _arguments) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _generateMExp = this.generateMExp(arg);
        _builder.append(_generateMExp);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _generateMExp(final Plus exp) {
    CharSequence _generateMExp = this.generateMExp(exp.getLeft());
    String _plus = (_generateMExp + "+");
    CharSequence _generateMExp_1 = this.generateMExp(exp.getRight());
    return (_plus + _generateMExp_1);
  }
  
  protected CharSequence _generateMExp(final Minus exp) {
    CharSequence _generateMExp = this.generateMExp(exp.getLeft());
    String _plus = (_generateMExp + "-");
    CharSequence _generateMExp_1 = this.generateMExp(exp.getRight());
    return (_plus + _generateMExp_1);
  }
  
  protected CharSequence _generateMExp(final Mult exp) {
    CharSequence _generateMExp = this.generateMExp(exp.getLeft());
    String _plus = (_generateMExp + "*");
    CharSequence _generateMExp_1 = this.generateMExp(exp.getRight());
    return (_plus + _generateMExp_1);
  }
  
  protected CharSequence _generateMExp(final Div exp) {
    CharSequence _generateMExp = this.generateMExp(exp.getLeft());
    String _plus = (_generateMExp + "/");
    CharSequence _generateMExp_1 = this.generateMExp(exp.getRight());
    return (_plus + _generateMExp_1);
  }
  
  protected CharSequence _generateMExp(final Variable exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _name = exp.getName().getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _generateMExp(final Constant exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  public void generateWorkflowFile(final Iterable<Workflow> workflows, final String systemName, final Iterable<Entity> entities, final IFileSystemAccess2 fsa) {
    String _lowerCase = systemName.toLowerCase();
    String _plus = (_lowerCase + "/");
    String _plus_1 = (_plus + "WorkflowManager");
    String _plus_2 = (_plus_1 + ".java");
    fsa.generateFile(_plus_2, this.generateWorkflowManager(workflows, systemName, entities, fsa));
  }
  
  public CharSequence generateWorkflowManager(final Iterable<Workflow> workflows, final String systemName, final Iterable<Entity> entities, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _lowerCase = systemName.toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("public class WorkflowManager {");
    _builder.newLine();
    _builder.append("private External code;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scanner scan = new Scanner(System.in);");
    _builder.newLine();
    _builder.append("String input; ");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e : entities) {
        _builder.append("\t");
        _builder.append("ArrayList<");
        String _name = e.getName();
        _builder.append(_name, "\t");
        _builder.append("> ");
        String _firstLower = StringExtensions.toFirstLower(e.getName());
        _builder.append(_firstLower, "\t");
        _builder.append("List = new ArrayList<>();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private ");
        String _name_1 = e.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" choose");
        String _firstUpper = StringExtensions.toFirstUpper(e.getName());
        _builder.append(_firstUpper, "\t");
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("int i = 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (");
        String _name_2 = e.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" x : ");
        String _firstLower_1 = StringExtensions.toFirstLower(e.getName());
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("List) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("System.out.println((i) + \": \" + x.toString());\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("i++;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("System.out.println(\"Please choose from list above, by index: \");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("input = scan.nextLine();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return ");
        String _firstLower_2 = StringExtensions.toFirstLower(e.getName());
        _builder.append(_firstLower_2, "\t\t\t");
        _builder.append("List.get(Integer.parseInt(input));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("} ");
        _builder.newLine();
      }
    }
    {
      for(final Workflow w : workflows) {
        _builder.append("\t");
        _builder.append("public void ");
        String _firstLower_3 = StringExtensions.toFirstLower(w.getName());
        _builder.append(_firstLower_3, "\t");
        _builder.append(" () {");
        _builder.newLineIfNotEmpty();
        {
          EList<Statement> _statements = w.getStatements();
          for(final Statement s : _statements) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _handleStatement = this.handleStatement(s);
            _builder.append(_handleStatement, "\t\t");
            _builder.append("\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public void generateExternals(final Registationsystem registationsystem, final IFileSystemAccess2 fsa) {
    String _lowerCase = registationsystem.getName().toLowerCase();
    String _plus = (_lowerCase + "/External.java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _lowerCase_1 = registationsystem.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public interface External {");
    _builder.newLine();
    {
      Iterable<External> _filter = Iterables.<External>filter(registationsystem.getDeclarations(), External.class);
      for(final External external : _filter) {
        _builder.append("\t");
        _builder.append("public boolean ");
        String _firstLower = StringExtensions.toFirstLower(external.getName());
        _builder.append(_firstLower, "\t");
        _builder.append("(");
        {
          EList<String> _parameters = external.getParameters();
          boolean _hasElements = false;
          for(final String param : _parameters) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            _builder.append(param, "\t");
            _builder.append(" ");
            String _generateParameter = this.generateParameter(param);
            _builder.append(_generateParameter, "\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus, _builder);
  }
  
  public String generateParameter(final String type) {
    int _plusPlus = this.id++;
    return ("p" + Integer.valueOf(_plusPlus));
  }
  
  private int id = 0;
  
  protected CharSequence _handleStatement(final Select statement) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = statement.getSelectType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _entityName = statement.getEntityName();
    _builder.append(_entityName);
    _builder.append(" = choose");
    String _name_1 = statement.getSelectType().getName();
    _builder.append(_name_1);
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleStatement(final Add statement) {
    StringConcatenation _builder = new StringConcatenation();
    String _toEntity = statement.getToEntity();
    _builder.append(_toEntity);
    _builder.append(".add");
    String _firstUpper = StringExtensions.toFirstUpper(statement.getToEntityRelation());
    _builder.append(_firstUpper);
    _builder.append("(");
    String _selectedEntityName = statement.getSelectedEntityName();
    _builder.append(_selectedEntityName);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("System.out.println(\"Added ");
    String _selectedEntityName_1 = statement.getSelectedEntityName();
    _builder.append(_selectedEntityName_1);
    _builder.append(" to ");
    String _toEntity_1 = statement.getToEntity();
    _builder.append(_toEntity_1);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleStatement(final Register s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String regex = \"\\\\d+\";");
    _builder.newLine();
    String _firstUpper = StringExtensions.toFirstUpper(s.getType().getName());
    _builder.append(_firstUpper);
    _builder.append(" ");
    String _name = s.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Attribute> _filter = Iterables.<Attribute>filter(this.allAtributeFields(s.getType()), Attribute.class);
      for(final Attribute a : _filter) {
        _builder.append("System.out.println(\"Please enter value for ");
        String _name_1 = s.getType().getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _name_2 = a.getName();
        _builder.append(_name_2);
        _builder.append(": \");");
        _builder.newLineIfNotEmpty();
        _builder.append("input = scan.nextLine();");
        _builder.newLine();
        {
          String _type = a.getType();
          boolean _equals = Objects.equal(_type, "int");
          if (_equals) {
            _builder.append("while(!input.matches(regex)){");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("System.out.println(\"Entered value was not of type ");
            String _type_1 = a.getType();
            _builder.append(_type_1, "\t");
            _builder.append(", please try again: \");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("input = scan.nextLine();");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            String _type_2 = a.getType();
            _builder.append(_type_2);
            _builder.append(" ");
            String _name_3 = a.getName();
            _builder.append(_name_3);
            _builder.append(" = Integer.parseInt(input);\t");
            _builder.newLineIfNotEmpty();
          } else {
            String _type_3 = a.getType();
            _builder.append(_type_3);
            _builder.append(" ");
            String _name_4 = a.getName();
            _builder.append(_name_4);
            _builder.append(" = input;\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("try {");
    _builder.newLine();
    String _name_5 = s.getName();
    _builder.append(_name_5);
    _builder.append(" = new ");
    String _name_6 = s.getType().getName();
    _builder.append(_name_6);
    _builder.append("(code, ");
    {
      ArrayList<Attribute> _allAtributeFields = this.allAtributeFields(s.getType());
      boolean _hasElements = false;
      for(final Attribute a_1 : _allAtributeFields) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_7 = a_1.getName();
        _builder.append(_name_7);
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(e.toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _firstLower = StringExtensions.toFirstLower(s.getType().getName());
    _builder.append(_firstLower);
    _builder.append("List.add(");
    String _name_8 = s.getName();
    _builder.append(_name_8);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void display(final EObject model) {
    try {
      final XMLResourceImpl res = new XMLResourceImpl();
      res.getContents().add(EcoreUtil.<EObject>copy(model));
      System.out.println("Dump of model:");
      res.save(System.out, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generateLogicExp(final LogicExp exp) {
    if (exp instanceof And) {
      return _generateLogicExp((And)exp);
    } else if (exp instanceof Comparison) {
      return _generateLogicExp((Comparison)exp);
    } else if (exp instanceof ExternalCall) {
      return _generateLogicExp((ExternalCall)exp);
    } else if (exp instanceof Or) {
      return _generateLogicExp((Or)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public CharSequence generateMExp(final Expression exp) {
    if (exp instanceof Variable) {
      return _generateMExp((Variable)exp);
    } else if (exp instanceof Constant) {
      return _generateMExp((Constant)exp);
    } else if (exp instanceof Div) {
      return _generateMExp((Div)exp);
    } else if (exp instanceof Minus) {
      return _generateMExp((Minus)exp);
    } else if (exp instanceof Mult) {
      return _generateMExp((Mult)exp);
    } else if (exp instanceof Plus) {
      return _generateMExp((Plus)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public CharSequence handleStatement(final Statement statement) {
    if (statement instanceof Add) {
      return _handleStatement((Add)statement);
    } else if (statement instanceof Register) {
      return _handleStatement((Register)statement);
    } else if (statement instanceof Select) {
      return _handleStatement((Select)statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement).toString());
    }
  }
}
